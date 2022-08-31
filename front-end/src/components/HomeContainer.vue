<template>
  <div class="home_container">
    <v-parallax
      class="container_paralax"
      src="../assets/parallax.png"  
      dark
    >    
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

    <div id="divisor_container_main">
      <h1 id="texto_subsecao_main">
        "Faça o teu melhor, na condição que você tem, enquanto você não tem condições melhores 
         para fazer melhor ainda!"
      </h1>
      <h3><i>Mario Sérgio Cortella</i></h3>
    </div>
    
    <!-- SUB SEÇÃO MAIN     -->
    <v-parallax
      class="container_paralax"
      src="../assets/parallax.png"      
      dark
    >    
      <v-row
        id="row_container_info_pessoal"
        align-item="center"
        justify="space-between"
        class="d-flex ma-10"        
        >
        <v-col
          class="d-flex text-center"
          cols="3"          
          >
          <v-img id="imagem_info_pessoal" src="../assets/foto_pessoal.png"></v-img>
        </v-col>       
        <v-col
          class="text-center"
          cols="8"          
          >
          <InfoPessoal />          
        </v-col>
      </v-row>
    </v-parallax>
  </div>
</template>

<script>
import InfoPessoal from "./InfoPessoal.vue";

export default {
    name: "HomeContainer",
    data:()=>({

    }),
    
    components: { InfoPessoal }
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

  #divisor_container_main{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 40vh;
    background-image: radial-gradient(circle, rgb(46, 44, 44), rgb(121, 121, 113), rgb(47, 49, 47));
    box-shadow: inset 2px 2px 2em rgb(121, 87, 67);
  }
  #divisor_container_main h3{
    color: #fff;
  }
  
  #texto_subsecao_main{
    color: #fff;
    /* text-shadow: 0 0 3px #FF0000; */
    text-shadow: 1px 1px 5px #161894;
    padding: 0 50px;
  }

  #row_container_info_pessoal{
    height: 15%;
  }

  #imagem_info_pessoal{
    align-self: end;
  }


</style>
