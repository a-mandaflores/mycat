import { createRouter, createWebHistory } from 'vue-router'

import Login from '@/views/login/LoginViews.vue'
import Create from '@/views/login/CreateViews.vue'
import Home from '@/views/login/IndexViews.vue'
import Pets from '@/views/home/IndexHome.vue'
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
    path: '/HomeViews.vue',
    component: Home
  },
  {
    path: '/CreateViews.vue',
    component: Create
  },
  {
    path: '/IndexHome.vue',
    component: Pets
  }]
})

export default router