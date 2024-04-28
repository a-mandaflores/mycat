<template>
    <TopBarComponent />
    <div v-if="cardPet" >
        <div class="cardPet">
            <CardComponentVue   @click="pet" class="animate__animated animate__fadeInUp" />
        </div>
            <div class="plus animate__animated animate__fadeInUp ">
                <div class="icon">
                    <Icon icon="mingcute:add-fill" />
                </div>
            </div>
        

        <img class="img-cat-dog animate__animated animate__fadeInUp" src="../../assets/ilustration/cat-and-dog.svg" alt="">
    </div>

    <PetsInfosViews @card="cardBack" v-if="!cardPet"/>
    
    


</template>

<script>
import { Icon } from '@iconify/vue';
import TopBarComponent from '@/components/TopBarComponent.vue';
import CardComponentVue from '@/components/CardComponent.vue';
import PetsInfosViews from './PetsInfosViews.vue';
export default{
    data(){
        return{
            cardPet: true
        }
    },
    components: {
        TopBarComponent,
        CardComponentVue,
        PetsInfosViews,
        Icon
    },
    methods: {
        pet(){
            this.cardPet = !this.cardPet
        },
        cardBack(){
            this.cardPet = !this.cardPet
        }
    }
}
</script>


<style lang="scss" scoped>
@import '../../styles/main.scss';

.img-cat-dog{
    display: flex;
    align-items: center;
    position: absolute;
    z-index: -100;
    bottom: 0;
    width: 80%;
    left: 10%;

}

.cardPet{
    display: flex;
    align-items: center;
    justify-content: center;
}

.plus{
    padding: 2rem;
    display: flex;
    align-items: center;
    justify-content: center;
    
    .icon{
        display: flex;
        align-items: center;
        justify-content: center;

        color: $black-color;
        cursor: pointer;
        font-size: 1.5rem;
        box-shadow: 1px 5px 8px rgb(0, 0, 0,.1);
        border-radius: 50%;
        width: 40px;
        height: 40px;
        background-color: #fff;
        transition: .2s ease-in-out;

    
    }
    
}

.icon:hover{
    background-color: $purple-color;
}


</style>