import { createRouter, createWebHistory } from 'vue-router'

import Login from '@/views/login/LoginViews.vue'
import Create from '@/views/login/CreateViews.vue'
import HomePets from '@/views/home/IndexHome.vue'
import Pets from '@/views/home/PetsInfosViews.vue'
import IndexViews from '@/views/login/IndexViews.vue'



const router = createRouter({
  history: createWebHistory(),
  routes:[{
    path: '/',
    component: IndexViews
  },
  {
    path: '/LoginViews.vue',
    component: Login
  },
  {
    path: '/CreateViews.vue',
    component: Create
  },
  {
    path: '/IndexHome.vue',
    component: HomePets
  },
  {
    path: '/PetsInfosViews.vue',
    component: Pets
  }]
})

export default router