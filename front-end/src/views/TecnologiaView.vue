<template>
  <div class="tecnologia_view">
    <TecnologiasComp />
    <router-link :to="{name: 'home'}">HOME</router-link>
  </div>
</template>
<script>
import TecnologiasComp from '@/components/TecnologiasComp.vue';

export default {
  name: 'TecnologiaView',
  components: { TecnologiasComp }
}
</script>

