<template>
  <div class="info_pessoal">
    <v-card id="card_info_pessoal">
      <v-card-title id="titulo_apresentacao">Texto de Informações Pessoais</v-card-title>
      <v-card-subtitle class="my-2">
        Aqui falar de formação e experiência profissional
      </v-card-subtitle>
      <v-card-text id="texto_info_pessoal">
        Mussum Ipsum, cacilds vidis litro abertis. Mauris nec dolor in eros commodo tempor.
        Aenean aliquam molestie leo, vitae iaculis nisl.In elementis mé pra quem é amistosis 
        quis leo.Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate 
        dapibus.Quem num gosta di mé, boa gentis num é. 
        Si num tem leite então bota uma pinga aí cumpadi!Quem num gosta di mé, boa gentis num é.
        Manduma pindureta quium dia nois paga.Cevadis im ampola pa arma uma pindureta.

      </v-card-text>
    </v-card>
  </div>
</template>

<script>
export default {
  name: 'HomeInfoPessoal',
}
</script>

<style scoped>

  #card_info_pessoal{
    background-color: rgba(222, 227, 238, 0.2);
    border: none;
    box-shadow: none;
  }

  #texto_info_pessoal{
    color: #000;
  }

  #titulo_apresentacao_main{
    text-align: center;
    margin-top: 60px;
  }
  

</style>
