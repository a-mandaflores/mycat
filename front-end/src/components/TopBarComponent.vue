<template>
  <div class="user">
    <div class="imgUser">

    </div>

    <SideBarComponentVue/>
  </div>
</template>

<script>
import SideBarComponentVue from './SideBarComponent.vue'
export default {
    components:{
        SideBarComponentVue
    }
}
</script>

<style lang="scss" scoped>
@import '../styles/main.scss';

.user{
  padding: .5rem;
  display: flex;
  align-items: center;
  justify-content: space-between;
  background-color: $purple-color-dark;
}
.imgUser{
  background-color: white;
  width: 50px;
  height: 50px;
  border-radius: 50%;
}
</style>