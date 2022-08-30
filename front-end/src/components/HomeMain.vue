<template>
  <div class="home">
    <HeaderComp />
    <HomeContainer />

  </div>
</template>

<script>
import HeaderComp from './HeaderComp.vue';
import HomeContainer from './HomeContainer.vue';

export default {
    name: "HomeMain",
    data:()=>({

    }),
    
    components: { HeaderComp, HomeContainer }
}
</script>

<style scoped>


</style>
