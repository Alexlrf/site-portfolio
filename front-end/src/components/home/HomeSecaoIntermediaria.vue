<template>
  <div class="home_secao_intermediaria">
    <v-row id="divisor_container_main" class="d-flex justify-center align-center">
      <div id="texto_subsecao_main">
        <h1>
          "Faça o teu melhor, na condição que você tem, enquanto você não tem condições melhores 
          para fazer melhor ainda!"
        </h1>
        <h4><i>Mario Sérgio Cortella</i></h4>
      </div>
    </v-row>
  </div>
</template>

<script>
  export default {
    name: 'HomeSecaoIntermediaria',
  }
</script>

<style scoped>
  #divisor_container_main{
    height: 40vh;
    background-image: radial-gradient(circle, rgb(46, 44, 44), rgb(121, 121, 113), rgb(47, 49, 47));
    box-shadow: inset 2px 2px 2em rgb(121, 87, 67);
  }    
  
  #texto_subsecao_main{
    display: flex;
    flex-direction: column;
    text-align: center;
    color: #fff;
    text-shadow: 1px 1px 5px #161894;
    padding: 0 50px;
  }  

</style>
