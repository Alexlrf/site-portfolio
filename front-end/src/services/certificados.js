import { http } from "./config";

export default {
    listar: () => {
        return http.get('certificados')
    },

    cadastrarCertificado: (certificado) =>{
        console.log(JSON.stringify(certificado))
        return http.post('certificado', certificado)
    }
}