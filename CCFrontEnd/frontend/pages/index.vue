<template>
  <div class="container">
    <h1 class="title">
      Lista Clienti
    </h1>
    <lista-clienti :clienti="clienti"/>
  </div>
</template>

<script>

import ListaClienti from "~/components/ListaClienti.vue"
export default {
  components: {
    ListaClienti
  },
  data () {
    return {
      clienti: {
        type: Array
      }
    }
  },
  asyncData (ctx) { //injects objects in clienti array defined previously 
    return {
      clienti: [
        {
          'id': '1',
          'nome': 'Prova',
          'indirizzo' : 'Via prova',
          'Telefono' : '031'
        },
        {
          'id': '2',
          'nome': 'Prova2',
          'indirizzo' : 'Via prova2',
          'Telefono' : '031'
        }
      ]
    }
  },

  async asyncData(ctx) {
    return {
      clienti : await ctx.app.$services.cliente.findAll()
    }
  }
}

</script>