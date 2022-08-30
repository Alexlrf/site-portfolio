<template>
  <div class="header">
    <v-img
      id="imagem_banner"
      src="../assets/banner.png"
      height="280px"
    >
      <h1 id="titulo_header">Alexsandro Fogazzi</h1>
      <hr class="hr3" />
      <p id="text_header" style="color:aliceblue">
        Mussum Ipsum, cacilds vidis litro abertis. Suco de cevadiss, é um leite divinis,
        qui tem lupuliz, matis, aguis e fermentis.Quem num gosta di mim que vai caçá sua
        turmis!Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.
        Manduma pindureta quium dia nois paga.
      </p>
      <v-row justify="center">
        <!-- LINK GITHUB -->
        <v-tooltip bottom>
          <template v-slot:activator="{ on, attrs }">
            <a href="https://github.com/Alexlrf" target="blank">         
              <v-icon
                color="#fff"
                large
                dark
                v-bind="attrs"
                v-on="on"
              >              
                mdi-github
              </v-icon>
            </a>
          </template>
          <span>github.com/Alexlrf</span>
        </v-tooltip>
        <!-- LINK LINKEDIN -->
        <v-tooltip bottom>
          <template v-slot:activator="{ on, attrs }">
            <a href="https://www.linkedin.com/in/alexfogazzi/" target="blank">         
              <v-icon
                color="#fff"
                large
                dark
                v-bind="attrs"
                v-on="on"
              >              
                mdi-linkedin
              </v-icon>
            </a>
          </template>
          <span>linkedin.com/in/alexfogazzi/</span>
        </v-tooltip>
        <!-- LINK ABOUT APPLICATION -->
        <v-tooltip bottom>
          <template v-slot:activator="{ on, attrs }">
            <router-link :to="{name: 'about'}">        
                <v-icon
                  color="#fff"
                  large
                  dark
                  v-bind="attrs"
                  v-on="on"
                >              
                  mdi-information
                </v-icon>
            </router-link>
          </template>
          <span>sobre o site</span>
        </v-tooltip>
        
      </v-row>
    </v-img>    
  </div>
</template>

<script>
export default {
    name: "HeaderComp",
    components: {  }
}
</script>

<style scoped>
  
a{
  text-decoration: none;
  margin: 0 5px;
}

#titulo_header{
  margin-top: 50px;
  text-align: center;
  color: #fff;
  text-shadow: 1px 1px 2px black;
}

#text_header{
  font-size: small;
  padding: 0 10%;
  text-align: center;
  margin-bottom: 2%;
  text-shadow: 1px 1px 2px black;
}

.hr3 {
  margin: 30px;
  border: 0;
  height: 2px;
  background-image: linear-gradient(to right, transparent, #CCC, transparent);  
}

</style>
