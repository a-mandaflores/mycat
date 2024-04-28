<template>
    <div  class="animate__animated animate__fadeIn">
        <div class="arrow" @click="card">
        <span class="material-symbols-outlined">chevron_left</span>
        Voltar
        </div>

        <div class="pet">
            <img class="imagem" src="../../assets/img/cat.jpg" alt="">

            <div class="card-container">

                <div class="card-name">
                    <div class="name">Apollo</div>
                    <div class="type">
                        <Icon class="icon" icon="solar:cat-linear" />
                    Gato</div>
                </div>

                <div class="card-birth">
                    <div class="year">1 ano</div>
                    <div class="birtday">
                        <Icon class="icon" icon="mingcute:birthday-2-line" />
                    24/04/2024</div>
                </div>
            </div>
        </div>

        <div class="button-container">
        <div class="card-button">
            <button class="inserir">Inserir historico</button>
            <button class="editar">Editar pet</button>
        </div>
        <div class="underline"></div>
        </div>

        <div class="historico">Histórico</div>

    </div>
    
    <HistoryComponentVue  class="card-historico animate__animated animate__fadeInUp" />



</template>
<script>
import { Icon } from '@iconify/vue';
import HistoryComponentVue from '@/components/HistoryComponent.vue';

export default{
    components:{
        Icon,
        HistoryComponentVue

    },
    methods: {
        card(){
            this.$emit('card')
        }
    }
}
</script>

<style lang="scss" scoped>
@import '../../styles/main.scss';

.pet{
    display: flex;
    align-items: center;
    justify-content: space-around;
    margin: 3rem;
}
.imagem{

    border-radius: 50%;
    width: 200px;
    height: 200px;
}

.card-container {
    display: flex;
    flex-direction: column;
    height: 100%;
}

.arrow{
    display: flex;
    align-items: center;
    cursor: pointer;
}

.name, .year{
    font-weight: 700;
    font-size: 1.5rem;
}

.type, .birtday{
    display: flex;
    align-items: center;
    font-weight: 400;
    font-size: .8rem;
}

.icon{
    font-size: 1rem;
}


.card-button{
    margin-bottom: 1rem;
    display: flex;
    align-items: center;
    justify-content: space-around;
}
button{
    border-radius: .2rem;
    cursor: pointer;
    border: none;
    padding: 1rem;

    transition: .2s ease-in-out;
}
button:hover{
    transform: scale(1.1);
}

.inserir{
    font-weight: 600;
    color: #fff;
    background-color: $purple-color-dark ;
}

.editar{
    background-color: rgb(209, 209, 209);
}

.underline{
    margin: 0 3rem;

    border: .5px solid rgb(233, 233, 233);
}

.historico{
    margin: 0 3rem ;
    padding: 1rem;
    color: $purple-color-dark;
}

.card-historico{
    margin: 0 3rem;
}
</style>