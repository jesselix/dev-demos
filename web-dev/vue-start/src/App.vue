<script>
// import HelloWorld from './components/HelloWorld.vue'
// import TheWelcome from './components/TheWelcome.vue'
import MyComp from './components/MyComp.vue';

export default {
  name: 'App',
  data() {
    return {
      title: "ssssssssssss",
      age: 20
    }
  },
  components: {
    MyComp
  }
}

</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>
  </header>

  <main>

    
  </main>

  <MyComp :title="title" :age="age"/>

</template>

<style scoped>

</style>
