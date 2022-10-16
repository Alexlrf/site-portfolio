<template>
  <div class="about">
    <CertificadosComp />
    <v-btn @click="disponibilizaTextos" color="primary" :loading="loading" :disabled="loading" />
    <h1>{{ts}}</h1>
  </div>
</template>

<script>
import CertificadosComp from './CertificadosComp.vue';
import Texto from '../services/textos'
export default {
    name: "AboutComp",
    data(){
      return {
        ts: '',
        loading: false

      }
    },
    components: { CertificadosComp },
    
    mounted() {
      console.log( 'montou'),
      function () {
        Texto.buscaPorIdentificador(2)
      }
    },
    
    methods: {

      teste(){
        Texto.listar().then(resposta => {
          console.log(resposta)
        })
      },

      disponibilizaTextos() {
        Texto.buscaPorIdentificador(2).then(reposta=>{
          this.loading = true
          this.ts = reposta.data.texto
          this.loading = false
        })
      },

    }
}
</script>

<style scoped>
  

</style>
