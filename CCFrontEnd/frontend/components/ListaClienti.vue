<template>
    <div class="lista-clienti-container">
        <h2 v-for="cliente in clienti" :key="cliente.Client_id" :nome="cliente.nome"> {{ cliente.nome }}, {{ cliente.indirizzo }} </h2>
    </div>
</template>

<script>

export default {
  props: {
    clienti: {
      type: Array,
      default () {
        return []
      }
    }
  },
  /*data () {
    return {
      titleOfNewToDo: ''
    }
  }*/
}
</script>

<style>
    .to-do-list-container {
         width: 400px;
         margin: auto;
         margin-top: 50px;
         display: block;
         box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
</style>