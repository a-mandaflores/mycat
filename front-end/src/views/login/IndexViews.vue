<template>
    <div  >
        
          <IlustrationComponent v-show="login"/>
        
          <MenuComponent @loginVerify="verify"/>

    </div>
    <LoginViews class="animate__animated animate__fadeInUp" v-if="!login"/>

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

</style>