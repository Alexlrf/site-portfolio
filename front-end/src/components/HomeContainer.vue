<template>
  <div class="home_container">
    <v-parallax
      class="container_paralax"
      src="../assets/parallax.png"  
      dark
    > 
      <!-- SEÇÃO SUPERIOR     -->     
      <HomeSecaoSuperior />
        
    </v-parallax>

    <HomeSecaoIntermediaria />
    
    <!-- SUB SEÇÃO MAIN     -->
    <v-parallax
      class="container_paralax"
      src="../assets/parallax.png"      
      dark
    >    
      <HomeSubSecao />
      
    </v-parallax>
  </div>
</template>

<script>
// import InfoPessoal from "./InfoPessoal.vue";
import HomeSubSecao from "./HomeSubSecao.vue";
import HomeSecaoSuperior from "./HomeSecaoSuperior.vue";
import HomeSecaoIntermediaria from "./HomeSecaoIntermediaria.vue";

export default {
    name: "HomeContainer",
    data:()=>({

    }),
    
    components: { HomeSubSecao, HomeSecaoSuperior, HomeSecaoIntermediaria }
}
</script>

<style scoped>  

</style>
