<template>
  <div class="home_secao_intermediaria">
    <v-row id="divisor_container_main" class="d-flex justify-center align-center">
      <h1 id="texto_subsecao_main">
        "Faça o teu melhor, na condição que você tem, enquanto você não tem condições melhores 
         para fazer melhor ainda!"
      </h1>
      <h3><i>Mario Sérgio Cortella</i></h3>
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

  #divisor_container_main h3{
    color: #fff;
  }    
  
  #texto_subsecao_main{
    color: #fff;
    /* text-shadow: 0 0 3px #FF0000; */
    text-shadow: 1px 1px 5px #161894;
    padding: 0 50px;
  }
  

</style>
