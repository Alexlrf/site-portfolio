<template>
  <div class="home_container">
    <v-parallax
      class="container_paralax"
      src="../../assets/parallax.png"  
      dark
    >           
      <HomeSecaoSuperior />        
    </v-parallax>
    <HomeSecaoIntermediaria />    
    <v-parallax
      class="container_paralax"
      src="../../assets/parallax.png"      
      dark
    >
     <HomeSubSecao />      
    </v-parallax>
  </div>
</template>

<script>
  import HomeSubSecao from "../home/HomeSubSecao.vue";
  import HomeSecaoSuperior from "../home/HomeSecaoSuperior.vue";
  import HomeSecaoIntermediaria from "../home/HomeSecaoIntermediaria.vue";

  export default {
    name: "HomeContainer",
    data:()=>({

    }),
    
    components: { HomeSubSecao, HomeSecaoSuperior, HomeSecaoIntermediaria }
  }
</script>

<style scoped>  

</style>
