<template>
    <div class="sideBar">
        <span @click="view" class="material-symbols-outlined icons ">menu</span>
    
    
        <div v-show="sideBar" class="side" >
            <span @click="view" class="material-symbols-outlined icons flecha">arrow_forward_ios</span>
            
            <div class="icons menu">
                <span class="material-symbols-outlined ">person</span>
                Perfil
            </div>
            <router-link to="/IndexHome.vue">
            <div class="icons menu">
                <span class="material-symbols-outlined">pets</span>
                Pets
            </div>
            </router-link>
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

<style lang="scss" scoped>
@import '../styles/main.scss';
.flecha{
    font-size: .8rem;
    padding-bottom: .5rem;
}
.sideBar{
    color: white;

}

.side {
    padding: .5rem;
    position: fixed;
    top: 0;
    right: 0;
    width: 150px;
    height: 100vh;
    background-color: $black-color;
    z-index: 100;    
}

.icons{
    display: flex;
    align-items: center;
    cursor: pointer;
}

.menu{
    
    padding: .8rem .5rem;
    transition: .2s ease-in-out;
}

.menu:hover{
    transform: scale(1.08);
}
</style>

