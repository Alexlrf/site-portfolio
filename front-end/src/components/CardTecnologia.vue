<template>
    <div  id="main_cards" >
        <!-- <v-hover
            v-slot="{ hover }"
            close-delay="209"
            open-delay="80"
        > -->
        <div v-for="(tec, id) in tecnologias" :key= "id">
            <v-card
                id="card"
                class="pa-2"
                @click="modalTecnologia(tec)"
                v-model="tecnologia"
                
            >            
                <v-img
                    id="img_card"
                    :src="require('@/assets/' + tec.imgCard)"
                />            
            </v-card>
        <!-- </v-hover> -->
        </div>
    </div>
</template>

<script>
export default {
    name: "CardTecnologia",
    props:{
        tecnologias: Array
    },
    data:()=>({
        img: "../assets/java.png",
        tecnologia: {
            imgCard:'',
            tituloCard: '',
            textoCard: ''

        }
    }),
    methods:{        
        modalTecnologia(tec){
            console.log(tec)

        }      

    }
    
}
</script>

<style scoped>

#main_cards{
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
    width: 80vw;
    margin: 0 auto;
  }

#card{
    margin: 25px;
    overflow: hidden;
    height: 150px;
    width: 150px;
    border-radius: 27%;
}

#card:hover{
    cursor: pointer;
    border: 2px solid rgb(155, 151, 151);
    box-shadow: 0 0 1em rgb(51, 51, 50);
    scale: 1.05;
    transition: 0.6s;
}

#card_title{
   color: rgb(12, 12, 12);
}

#img_card{
    margin: 0 auto;
}



</style>