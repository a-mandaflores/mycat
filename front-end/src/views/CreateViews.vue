<template>
    <div class="containerLogin">
        <div class="loginInputs">
            <h1>Criar Conta</h1>
            <input type="nome" placeholder="Nome" v-model="requestBody.nome">
            <input type="tel" placeholder="Telefone" v-model="requestBody.tel" >
            <input type="email" placeholder="Email" v-model="requestBody.email" >
            <input type="RepetirEmail" placeholder="Repetir email">
            <input type="password" placeholder="Senha" v-model="requestBody.password">
        </div>
        <div class="buttonLogin">
            <router-link to="/LoginViews.vue">
            <button class="criarConta" > Ja tenho conta</button>
            </router-link>
            <router-link to="/HomeViews.vue">
            <button class="entrar" @click="postData">Criar</button>
            </router-link>
        </div>
    </div>


</template>

<script>

export default{
    data(){
        return{

            responseData: null,
            requestBody: {
                email: "",
                name: "",
                password:"",
                tel: ""
                }
            
        }
    },

    methods:{
        
        postData(){

            this.$emit('')
            console.log(this.requestBody)
        }

    }
}
</script>


<style lang="scss" scoped>
@import '../styles/main.scss';


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
