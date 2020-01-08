// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import App from './App'
import router from './router'
import axios from 'axios'
import lodash from 'lodash'
import moment from 'moment'
import VueMomentJS from 'vue-momentjs'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.config.productionTip = false
Vue.prototype.$axios = axios
Vue.use(BootstrapVue)
Vue.use(lodash)
Vue.component('font-awesome-icon', FontAwesomeIcon)
Vue.use(VueMomentJS, moment)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
