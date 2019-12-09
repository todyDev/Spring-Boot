<template>
  <div id="app">
    <Header/>
    <main class="container content">
      <router-view/>
    </main>
    <Footer/>
  </div>
</template>

<script>
import Header from '@/components/templates/Header'
import Footer from '@/components/templates/Footer'
export default {
  name: 'App',
  components: {
    Header,
    Footer
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.content {
  margin-top: 35px;
  margin-bottom: 35px;
}

</style>
