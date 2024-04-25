<template>
    <span class="material-symbols-outlined">chevron_left</span>
        
    <div class="pet">
        <img class="imagem" src="../../assets/img/cat.jpg" alt="">

        <div class="card-container">

            <div class="card-name">
                <div class="name">Apollo</div>
                <div class="type">
                    <Icon icon="solar:cat-linear" />
                Gato</div>
            </div>

            <div class="card-birth">
                <div>1 ano</div>
                <div class="birtday">
                    <Icon icon="mingcute:birthday-2-line" />
                24/04/2024</div>
            </div>
        </div>
    </div>
</template>
<script>
import { Icon } from '@iconify/vue';

export default{
    components:{
        Icon
    }
}
</script>

<style scoped>

.pet{
    display: flex;
    align-items: center;
    justify-content: space-between;
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




</style>