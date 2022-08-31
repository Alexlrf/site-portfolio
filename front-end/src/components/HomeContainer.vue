<template>
  <div class="home_container">
    <v-parallax
      id="container_paralax"
      src="../assets/parallax.png"      
      dark
    >    
      <v-row
        align-item="center"
        justify="center"
        >
        <v-col
          class="text-center"
          cols="10"
          
          >
          <h1 id="titulo_apresentacao_main" class="mb-6 mt-10">
            Uma breve apresentação
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
    </v-parallax>

    <!-- SUB SEÇÃO MAIN     -->
    <div id="sub_secao_main">
      <h1 id="texto_subsecao_main">
        Outro texto de algo
      </h1>
    </div>
    <v-parallax
      id="container_paralax"
      src="../assets/parallax.png"      
      dark
    >    
      <v-row
        align-item="center"
        justify="center"
        >
        <v-col cols="2">
          <h1>Mais alguma coisa qualquer</h1>
        </v-col>
        <v-col
          class="text-center"
          cols="10"
          
          >
          <h1 id="titulo_apresentacao" class="mb-6 mt-10">
            Um breve texto
          </h1>
          <h3 class="mb-6 mt-10">
            Vuetify
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
    </v-parallax>

  </div>
</template>

<script>

export default {
    name: "HomeContainer",
    data:()=>({

    }),
    
    components: {  }
}
</script>

<style scoped>

  h1, h3, p{
    color: #000;
    font-weight: bold;

  }

  #titulo_apresentacao_main{
    text-align: center;
    margin-top: 60px;
  }

  #foto_user{
    width: 170px;
    height: 150px;
    border-radius: 50%;
  }

  #sub_secao_main{
    display: flex;
    justify-content: center;
    align-items: center;
    height: 40vh;
    background-image: radial-gradient(circle, rgb(46, 44, 44), rgb(121, 121, 113), rgb(47, 49, 47));
    box-shadow: inset 2px 2px 2em rgb(121, 87, 67);
  }
  
  #texto_subsecao_main{
    color: #fff;
    /* text-shadow: 0 0 3px #FF0000; */
    text-shadow: 1px 1px 5px #161894;
  }


</style>
