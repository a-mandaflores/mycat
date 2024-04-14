<template>
  <div class="container">
  <transition name="slide">
      <IlustrationComponent v-show="login"/>
  </transition>

  <div :class="style">
  
  <MenuComponent :menuSize="menuSize" @loginVerify="verify" />

  <router-view @menuLogin="menuSizeLogin" class="login" v-show="!login" />
</div>
  </div>
</template>

<script>
import IlustrationComponent from "./components/IlustrationComponent.vue"
import MenuComponent from "./components/MenuComponent.vue"

export default {
  data(){
    return {
      login: true,
      style: 'menu',
      criarContaBoolean: false,
      menuSize: false
    }
  },
  name: 'App',
  components: {
    IlustrationComponent,
    MenuComponent
  },
  methods: {
    verify(){
      this.login = !this.login
      this.style = "menu-fixed"
    },
    menuSizeLogin(element){
      this.menuSize = element
      console.log(element)
      console.log(this.menuSize)
    }
    
  }
}
</script>

<style lang="scss" >

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

.login{
  position: inherit;
}

.menu-fixed {
  animation: slideYMypet .8s;

  position: fixed;
  top: 0;
  width: 100%;
  @keyframes slideYMypet {
    0%{
    transform: translateY(220%);
  
  }
  100%{
    transform: translateY(0%);
  }
  }
}


.slide-leave-active {
  animation: slideY 0.8s;

}



@keyframes slideY {
  0%{
    transform: translateY(0);
  
  }
  100%{
    transform: translateY(-100%);
  }
}
</style>
