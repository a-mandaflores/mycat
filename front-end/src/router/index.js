import { createRouter, createWebHistory } from 'vue-router'

import Login from '@/views/LoginViews.vue'
import Create from '@/views/CreateViews.vue'
import Home from '@/views/HomeViews.vue'
import MenuComponent from '@/components/MenuComponent.vue'

const router = createRouter({
  history: createWebHistory(),
  routes:[{
    path: '/',
    component: MenuComponent
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
  }]
})

export default router