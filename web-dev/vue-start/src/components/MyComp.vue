<template>
    <h3>send data</h3>
    <p>{{ title }}</p>
    <p>{{ age }}</p>
</template>

<script>
export default {
    name: "MyComp",
    props: {
        title: {
            type: String,
            dafault: ""
        },
        age: {
            type: Number,
            default: 0
        }
    }
}
</script>

<style scoped>
h3 {
    color: red
}
</style>