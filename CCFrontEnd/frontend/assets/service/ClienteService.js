import Cliente from "~/assets/data/Cliente.class"
import axios from 'axios'

export default class ClienteApi {
    constructor($axios) {
        this.axios = $axios 
    }

    findAll() {

        return axios.get('http://localhost:8080/clienti').then( (response) => {
            const clienti = []
            response.data.forEach((cliente) => {
                clienti.push(new Cliente( cliente.Client_id, cliente.nome, cliente.indirizzo, cliente.telefono))
            })
            return clienti
        })

    }
    
}