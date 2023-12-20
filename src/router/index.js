import VueRouter from 'vue-router'
import Vue from 'vue'
import compItem from '@/components/compItem.vue'
import compDetail1 from '@/components/compDatail1.vue'
import compDetail2 from '@/components/compDatail2.vue'
import compDetail3 from '@/components/compDatail3.vue'
import compDetail4 from '@/components/compDatail4.vue'

Vue.use(VueRouter)

export default new VueRouter({
  routes: [
    {
      path: '/',
      name: 'compItem',
      component: compItem,
    },
    {
      path: '/detail1',
      name: 'compDetail1',
      component: compDetail1,
    },
    {
      path: '/detail2',
      name: 'compDetail2',
      component: compDetail2,
    },
    {
      path: '/detail3',
      name: 'compDetail3',
      component: compDetail3,
    },
    {
      path: '/detail4',
      name: 'compDetail4',
      component: compDetail4,
    },
  ],
})
