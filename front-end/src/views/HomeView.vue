<template>
  <div>
    <HeaderComp />
    <HomeContainer />
  </div>
</template>

<script>
import HeaderComp from '@/components/HeaderComp.vue';
import HomeContainer from '@/components/home/HomeContainer.vue';

  export default {
    name: 'HomeView',
    components: {
    HeaderComp,
    HomeContainer
},
  }
</script>
