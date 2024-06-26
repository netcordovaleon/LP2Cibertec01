const BASE_URL = "localhost:8081/";

const GetClients = "client";

const getClientsAjax  = () => {

//fetch("", ).then(c=> {}).catch(e=> {})

    $.ajax({
        type: 'GET',
        url: `${BASE_URL}${GetClients}`,
        success: (data) => {
            //Esto se ejecuta solo cuando la conexion entre B y F es exitosa
            console.log(data);
        },
        error: ()=> {
            //Solo si hay algun error se ejecuta esta sentencia
            alert('No hay comunicación entre BackEnd y FrontEnd')
        }
    })
}


$(document).ready(function() {

    alert('Ajax and JQuery are loaded')

    getClientsAjax();
});