<template>
    <div class="container">
        <transition name="slide">
            <IlustrationComponent v-show="login"/>
        </transition>
        <MenuComponent class="slideYMypet" @loginVerify="verify"/>
    </div>
    <LoginViews v-if="!login"/>

</template>

<script>
import IlustrationComponent from "../../components/IlustrationComponent.vue"
import MenuComponent from "../../components/MenuComponent.vue"
import LoginViews from "./LoginViews.vue"
import router from '@/router'


export default{
    components:{
        MenuComponent,
        IlustrationComponent,
        LoginViews

    },
    data(){
        return {
            home: 'on',
            login: true
        }
    },
    onMounted: {
        setup(){}
    },
    methods:{
        setup(){
            const token = window.localStorage.getItem('token')
            if (token){
                router.push({ name: 'Pet' })
            }
        },
        verify(e){
            this.login = e
            this.style = "menu-fixed"

            this.$emit('login', this.login)
        }, 
        menuSizeLogin(element){
            this.menuSize = element
            console.log(element)
            console.log(this.menuSize)
        }
       
    }
}
</script>

<style lang="scss" scoped>
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

  @keyframes slideY {
    0%{
      transform: translateY(0);
    
    }
    100%{
      transform: translateY(-100%);
    }
  }


  
.login{
    position: inherit;
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