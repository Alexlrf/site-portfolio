<template>
  <div class="home">
    <HeaderComp />
    <v-row justify="space-around" class="d-flex mt-25">
      <CardTecnologia :tecnologias="tecnologias" />
    </v-row>
    
  </div>
</template>

<script>
import HeaderComp from './HeaderComp.vue';
import CardTecnologia from './CardTecnologia.vue';

export default {
  name: "TecnologiasComp",
  data:()=>({
    tecnologias:[
      {
        imgCard:'maven.png',
        titulo: 'Maven',
        texto: 'Maven Maven Maven'
      },
      {
        imgCard:'java.png',
        titulo: 'Java',
        texto: 'Java Java Java'
      },
      {
        imgCard:'javascript.png',
        titulo: 'Javascript',
        texto: 'Javascript Javascript Javascript'
      },
      {
        imgCard:'vue.png',
        titulo: 'Vue',
        texto: 'Vue Vue Vue'
      },
      {
        imgCard:'css.png',
        titulo: 'Css',
        texto: 'Css Css Css'
      },
      {
        imgCard:'html5.png',
        titulo: 'Html',
        texto: 'Html Html Html'
      },
      {
        imgCard:'spring.png',
        titulo: 'Spring',
        texto: 'Spring Spring Spring'
      },
      {
        imgCard:'java.png',
        titulo: 'Java',
        texto: 'Java Java Java'
      },
      {
        imgCard:'css.png',
        titulo: 'Css',
        texto: 'Css Css Css'
      },
      {
        imgCard:'html5.png',
        titulo: 'Html',
        texto: 'Html Html Html'
      },
      {
        imgCard:'spring.png',
        titulo: 'Spring',
        texto: 'Spring Spring Spring'
      },
      {
        imgCard:'java.png',
        titulo: 'Java',
        texto: 'Java Java Java'
      },
      {
        imgCard:'css.png',
        titulo: 'Css',
        texto: 'Css Css Css'
      },
    ]
  
  }),
  components: { HeaderComp, CardTecnologia }
}
</script>

<style scoped>

</style>
