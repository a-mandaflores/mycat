<template>
    <div class="card">
        <div class="display-img">
        <div class="card-img">
            <img src="../img/cat.jpg" alt="">
        </div>

        <div class="card-cat">
        <div class="name">Apollo</div>
        <div class="type">gato</div>
        </div>
        </div>

        <div class="year">1 ano</div>
    </div>
</template>

<script></script>


<style lang="scss" scoped>
@import '../styles/main.scss';

.card{
    cursor: pointer;
    width: 90vw;
    background-color: $card-bg-color;
    margin: 1rem;
    padding: .6rem;
    display: flex;
    align-items: top;
    justify-content: space-between;
    transition: .2s ease-in-out;
}

.card:hover{
    background-color: rgb(175, 29, 215, .4);
}
.display-img{
    display: flex;
}

.card-cat{
    margin-left: .4rem;
    .name{
        font-size: .8rem;
        font-weight: 700;
    }

    .type{
        font-size: .5rem;
        text-transform: uppercase;
    }
}

.year{
    font-size: .8rem;
    font-weight: 700;
}

.card-img {
    position: relative;
    width: 60px;
    height: 60px;
    border-radius: 50%;
    overflow: hidden;
}

img{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    height: 100%;
}
</style>