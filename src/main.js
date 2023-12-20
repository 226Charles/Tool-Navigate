import Vue from 'vue'
import App from './App.vue'

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
 
Vue.use(ElementUI);
Vue.config.productionTip = false

//注册全局组件
import compNavi from './components/compNavi.vue'
Vue.component("compNavi",compNavi)

import router from './router'


new Vue({
  router: router,
  render: h => h(App),
}).$mount('#app')
