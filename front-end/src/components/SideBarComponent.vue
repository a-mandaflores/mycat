<template>
    <div class="sideBar">
        <span @click="view" class="material-symbols-outlined menuButton">menu</span>
    
    
        <div v-show="sideBar" class="side" >
            <span @click="view" class="material-symbols-outlined flecha">arrow_forward_ios</span>
            
            <div class="meuPerfil">
                <span class="material-symbols-outlined icons">person</span>
                Perfil
            </div>
            <div class="meusPets">
                <span class="material-symbols-outlined icons">pets</span>
                Pet
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return{
            sideBar: false,
        }
    },
    methods:{
        view(){
            this.sideBar = !this.sideBar
        }
    }
}
</script>

<style scoped>
.side {
    position: fixed;
    top: 0;
    right: 0;
    width: 150px;
    height: 100vh;
    background-color: $black-color;
    z-index: 100;    
}
</style>

