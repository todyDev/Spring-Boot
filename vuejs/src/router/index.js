import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import BoardList from '@/components/board/BoardList'
import BoardWrite from '@/components/board/BoardWrite'
import BoardDetail from '@/components/board/BoardDetail'

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
    },
    {
      path: '/board/boardWrite/:boardIdx?',
      name: 'BOARD-WRITE-PAGE',
      component: BoardWrite
    },
    {
      path: '/board/boardDetail/:boardIdx',
      name: 'BOARD-DETAIL-PAGE',
      component: BoardDetail
    }

  ]
})
