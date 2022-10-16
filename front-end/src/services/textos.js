import { http } from "./config";

export default {

    listar: ()=> {
        return http.get('texto/todos');
    },

    buscaPorIdentificador: (id)=> {
        return http.get(`texto/${id}`)
    }
}