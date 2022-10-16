<template>
  <div class="home_sub_secao">
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
        <v-img id="imagem_info_pessoal" src="../../assets/foto_pessoal.png"></v-img>
      </v-col>       
      <v-col
        class="text-center"
        cols="8"          
      >
        <HomeInfoPessoal />          
      </v-col>
    </v-row>
  </div>
</template>

<script>
  import HomeInfoPessoal from '../home/HomeInfoPessoal.vue';
  export default {
    name: "HomeSubSecao",
    components: { HomeInfoPessoal }
  }
</script>

<style scoped>
  #row_container_info_pessoal{
    height: 15%;
  }

  #imagem_info_pessoal{
    align-self: end;
  }  

</style>
