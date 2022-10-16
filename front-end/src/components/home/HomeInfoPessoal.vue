<template>
  <div class="info_pessoal">
    <v-card id="card_info_pessoal">
      <v-card-title id="titulo_info_pessoal">Formação e Experiência Profissional</v-card-title>
      <v-card-subtitle id="subtitulo_info_pessoal" class="my-2">
        Um breve resumo do que tenho estudado e trabalhado até agora
      </v-card-subtitle>
      <v-card-text id="texto_info_pessoal">
        Mussum Ipsum, cacilds vidis litro abertis. Mauris nec dolor in eros commodo tempor.
        Aenean aliquam molestie leo, vitae iaculis nisl.In elementis mé pra quem é amistosis 
        quis leo.Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate 
        dapibus.Quem num gosta di mé, boa gentis num é. 
        Si num tem leite então bota uma pinga aí cumpadi!Quem num gosta di mé, boa gentis num é.
        Manduma pindureta quium dia nois paga.Cevadis im ampola pa arma uma pindureta.
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
    background-color: rgba(204, 215, 238, 0.2);
    border: none;
    box-shadow: none;
  }
  
  #titulo_info_pessoal{
    text-align: center;
    margin-top: 60px;
  }  
  
  #subtitulo_info_pessoal{
    color: #000;
  }

  #texto_info_pessoal{
    color: #000;
  }
  
</style>
