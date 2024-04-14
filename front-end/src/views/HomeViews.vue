<template>
    <router-link to="/PetsInfosViews.vue">
    <CardComponent  />
    </router-link>
</template>

<script>
import CardComponent from '@/components/CardComponent.vue';

export default{
    components:{
        CardComponent
    },
    data(){
        return {
            home: 'on'
        }
    }
}
</script>