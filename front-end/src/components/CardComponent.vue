<template>

    <div class="card" @click="cardPet">
        <div class="card-container">
            <div class="name">Apollo</div>
            <div class="type">
                <Icon icon="solar:cat-linear" />
                Gato</div>
            <div class="birtday">
                <Icon icon="mingcute:birthday-2-line" />
                
                1 ano</div>
        </div>

        <img class="imagem" src="../assets/img/cat.jpg" alt="">

    </div>

    

</template>

<script>
import { Icon } from '@iconify/vue';

export default{
    components:{
        Icon
    },
    methods: {
        cardPet(){
            console.log('Estou passando')
        }
    }
}
</script>


<style lang="scss" scoped>
@import '../styles/main.scss';

.card{
    display: flex;
    align-items: top;
    justify-content: space-between;

    color: $black-color;
    box-shadow: 1px 5px 8px rgb(0, 0, 0,.1);
    border-radius: 1rem;
    cursor: pointer;
    width: 90vw;
    background-color: #fff;
    margin: 1rem;
    padding: 1rem;
    transition: .2s ease-in-out;
    height: 9rem;
}

.card-container{
    padding-left: 1rem;
}

.name{
    font-size: 1.2rem;
    font-weight: 700;
}
.imagem{
    height: 7rem;
    width: 7rem;
    border-radius: 50%;
    margin-right: 1rem;
}
.type, .birtday{
    font-size: .6rem;
    text-transform: uppercase;
    font-weight: 500;
    display: flex;
    align-items: center;
}

</style>