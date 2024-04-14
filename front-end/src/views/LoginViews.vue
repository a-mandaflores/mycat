<template>
    <div class="containerLogin">
        <div class="loginInputs">
            <h1>LOGIN</h1>
            <input type="email" placeholder="Email" v-model="email">
            <input type="password" placeholder="Senha" v-model="password">
        </div>
        <div class="buttonLogin">
            <router-link to="/CreateViews.vue">
            <button class="criarConta">Criar Conta</button>
            </router-link>
            
            <router-link to="/HomeViews.vue">
            <button class="entrar" @click="loginUser">Entrar</button>
            </router-link>
        </div>
    </div>


</template>

<script>

export default{
    data(){
        return{
            login: {
            email: "",
            password: ""
            },
            menuLogin: false
        }
    },
    methods: {
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

            this.menuLogin = !this.menuLogin
            this.$emit('menuLogin', this.menuLogin)
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
