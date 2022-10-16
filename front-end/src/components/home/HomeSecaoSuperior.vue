<template>
  <div class="home_secao_superior">
    <v-row
      align-item="center"
      justify="center"
      class="d-flex ma-5"
    >
      <v-col
        class="text-center"
        cols="10"        
      >
        <h1 id="titulo_apresentacao_main" class="mb-6 mt-10">
          {{ tituloApresentacao }}
        </h1>
        <h3 class="mb-6 mt-10">
          Sub-titulo de apresentação
        </h3>
        <p>
          Mussum Ipsum, cacilds vidis litro abertis. Mauris nec dolor in eros commodo tempor.
          Aenean aliquam molestie leo, vitae iaculis nisl.In elementis mé pra quem é amistosis 
          quis leo.Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate 
          dapibus.Quem num gosta di mé, boa gentis num é. 
          Si num tem leite então bota uma pinga aí cumpadi!Quem num gosta di mé, boa gentis num é.
          Manduma pindureta quium dia nois paga.Cevadis im ampola pa arma uma pindureta.

        </p>          
      </v-col>
    </v-row>
  </div>
</template>

<script>
  import Texto from '../../services/textos'
  export default {
    name: 'HomeSecaoSuperior',
    data(){
      return{
        tituloApresentacao: ''

      }
    },

    onMonted(){
      this.buscaTextos()

    },

    computed: {

      buscaTextos: function(){
        // eslint-disable-next-line vue/no-async-in-computed-properties
        Texto.listar().then(resposta => {
          this.tituloApresentacao = resposta.data[0]
        })
        return ''
      }

    },

    methods: {

      // buscaTextos(){
      //   // eslint-disable-next-line vue/no-async-in-computed-properties
      //   Texto.listar().then(resposta => {
      //     this.tituloApresentacao = resposta.data[0]
      //   })        
      // }

      
      
    }

  }
</script>

<style scoped>
  h1, h3, p{
    color: #000;
    font-weight: bold;
  } 

</style>
