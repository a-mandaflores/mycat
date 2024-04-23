<template>
    <div class="containerLogin" v-if="!created">
        <div class="loginInputs">
            <h1>LOGIN</h1>
            <input type="email" placeholder="Email" v-model="email">
            <input type="password" placeholder="Senha" v-model="password">
        </div>
        <div class="buttonLogin">
            <button class="criarConta" @click="criarConta" >Criar Conta</button>
            <button class="entrar" @click="loginUser">Entrar</button>
        </div>
    </div>

    <CreateViews v-else />


</template>

<script>
import router from '@/router'
import CreateViews from './CreateViews.vue'

export default{
    components:{
        CreateViews
    },
    data(){
        return{
            login: {
            email: "",
            password: ""
            },
            created: false,
            
        }
    },
    onMounted: {
        
    },
    methods: {
        criarConta(){
            this.created = !this.created
        },
        async loginUser() {
            // try {
            // const response = await fetch("http://localhost:8080/tutor", {
            // method: "PUT",
            // headers: {
            //     "Content-Type": "application/json",
            // },
            // body: JSON.stringify(this.login),
            // });
            // console.log('Deu certo')
            // const result = await response.json();
            // console.log("Success:", result);
            // } catch (error) {
            //     console.error("Error:", error);
            // }
            router.push('IndexHome.vue' )
            }

        
        }
}
    

</script>


<style lang="scss" scoped>
@import '../../styles/main.scss';


.containerLogin{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    width: 100%;
}

.loginInputs{
    color: $purple-color;
    padding: 1.5rem;
    display: flex;
    flex-direction: column;


    input{
        border-radius: 15px;
        border: none;
        background-color: #F2F2F2;
        margin: 1rem;
        width: 280px;
        height: 35px;
        padding-left: 1rem;
    }
    input:active, input:focus{
        outline: 0;
    }
    h1{
       font-weight: 800;
       font-size: 2rem; 
        padding-left: 1rem;

    }

}

.buttonLogin{
    width: 280px;
    display: flex;
    justify-content: space-between;
    button{
        cursor: pointer;
        font-size: .8rem;
        border: none;
        padding: 1rem;
        border-radius: 25px;
        width: 130px;
        transition: .5s ease-in-out;

    }

    .entrar{
        background-color: $purple-color;
        color: white;
        font-weight: 600;
    }
    .criarConta{
        color: $purple-color;
    }

    .entrar:hover{
        background-color: $purple-color-dark;
    }
    .criarConta:hover{
        background-color: #cacaca;
    }
}
</style>
