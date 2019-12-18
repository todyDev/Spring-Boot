import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import BoardList from '@/components/board/BoardList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/board/boardList',
      name: 'BOARD-LIST-PAGE',
      component: BoardList
    }

  ]
})
