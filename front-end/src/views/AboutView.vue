<template>
  <div class="aboutView">
    <AboutComp />
    <router-link :to="{name: 'home'}">HOME</router-link>
  </div>
</template>
<script>
import AboutComp from '@/components/AboutComp.vue';

export default {
  name: 'AboutView',
  components: { AboutComp }
}
</script>

