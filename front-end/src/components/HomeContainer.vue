<template>
  <div class="home_container">
    <v-parallax
      id="container_paralax"
      dark
    >
      <v-row
        align="center"
        justify="center"
      >
        <v-col
          class="text-center"
          cols="12"
        >
          <h1 class="text-h4 font-weight-thin mb-4">
            Vuetify
          </h1>
          <h4 class="subheading">
            Build your application today!
          </h4>
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

  #container_paralax{
    background-image: linear-gradient(-45deg, #DECBA4, #3E5151, #a2a5a5);
  }


</style>
