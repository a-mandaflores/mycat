<template>
    <div class="ilustration">
    <img src="../assets/ilustration/Ilustration.svg" alt="">
    </div>
</template>

<style lang="scss" scoped>
@import '../styles/main.scss';

.ilustration{
    width: 100vw;
    height: 70vh;
    overflow: hidden;
    background-color: $purple-color-dark;
    display: flex;
    justify-content: center;
    align-items: center;
    
    img{
        width: 90%;
    }
    transition: .1s ease-in-out;
}


</style>