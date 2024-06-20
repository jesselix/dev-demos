<template>
  <div class="hello">
    <h1>Vue: learning</h1>
    <p>{{ message }}</p>
    <div v-html="rawHtml"></div>
    <div v-bind:id="dynamicId"></div>
    <p>{{ num + 5 }}</p>
    <p>{{ ok ? 'yes' : 'no' }}</p>
    <p v-if="flag">flag true</p>
    <p v-else="flag">flag false</p>
    <ul>
      <li v-for="item in newList">
        {{ item.title }}
      </li>
    </ul>
    <button @click="counter += 1">{{ counter }}</button>
    <input type="text" v-model="message">
    <p>{{ message }}</p>
    <button @click="clickThis">go go go</button>
  </div>
</template>

<style scoped></style>

<script>
export default {
  name: 'hello world',
  data() {
    return {
      message: "how to learn vue",
      rawHtml: "<a href='http://jesse.li'>what</a>",
      dynamicId: 10001,
      num: 10,
      title: "1111111111111",
      ok: false,
      flag: false,
      newList: [
        {
          id: 101,
          title: "news 101"
        },
        {
          id: 102,
          title: "news 102"
        },
        {
          id: 103,
          title: "news 103"
        }
      ],
      counter: 1
    }
  },
  methods: {
    clickThis() {
      console.log("click this");
    }
  }
}

</script>
