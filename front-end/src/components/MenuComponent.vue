<template>
    <!-- <div class="wave"></div> -->
    

    <div class="menu">
        <transition>
            <div v-show="login" class="custom-shape-divider-top-1711903935">
                <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120" preserveAspectRatio="none">
                <path d="M321.39,56.44c58-10.79,114.16-30.13,172-41.86,82.39-16.72,168.19-17.73,250.45-.39C823.78,31,906.67,72,985.66,92.83c70.05,18.48,146.53,26.09,214.34,3V0H0V27.35A600.21,600.21,0,0,0,321.39,56.44Z" class="shape-fill"></path></svg>
            </div>
        </transition>
    
        <LogoComponent />
    
        <router-link to="/LoginViews.vue">
        <div class="button" @click="loginVerify()" v-show="login">
            <span  class="material-symbols-outlined">
            arrow_forward_ios</span>

        </div>
        </router-link>  
    </div>
</template>


<script>
import LogoComponent from "../components/LogoComponent.vue"
export default{
    data(){
        return{
            login: true
        }
    },    
    components: {
        LogoComponent
    },
    methods: {
        loginVerify(){
            this.login = !this.login
            this.$emit('loginVerify', this.login)
        }
    }
}

</script>

<style lang="scss" scoped>
@import '../styles/main.scss';


.menu{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    height: 30vh;
    background-color: $black-color;
}
.button{
    cursor: pointer;
    margin-top: 10px;
    color: $black-color;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 50px;
    width: 50px;
    border-radius: 50%;
    background-color: $purple-color;

    transition: .2s ease-in-out;
}
.button:hover{
    background-color: $purple-color-dark;
}

.custom-shape-divider-top-1711903935 {
    position: absolute;
    top: 63.7%;
    left: 0;
    width: 100%;
    overflow: hidden;
    line-height: 0;
    transform: rotate(180deg);
}

.custom-shape-divider-top-1711903935 svg {
    position: relative;
    display: block;
    width: calc(100% + 1.3px);
    height: 60px;
}

.custom-shape-divider-top-1711903935 .shape-fill {
    fill: $black-color;
}


</style>