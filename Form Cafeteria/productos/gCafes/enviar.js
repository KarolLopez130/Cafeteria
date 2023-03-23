// METODO POST

$('#btnSend').on('click', function(){

    if ($('#names').val() != "" && $('#tipo').val() != "" && $('#descripcion').val() != "" && $('#precio').val() != 0 && $('#url').val() != ""){


        let postre = {

            nombre: $('#names').val(),
            tipo: $('#tipo').val(),
            descripcion: $('#descripcion').val(),
            precio: parseInt($('#precio').val()),
            imagen: $('#url').val(),

        }

        let postreEnvio = JSON.stringify(postre);
        $.ajax({

            url: "http://localhost:8080/AgregarCafe",
            type: "POST",
            data: postreEnvio,
            contentType: "application/JSON",
            dataType: "JSON",

            success: function(response){
                alert(response);
            }

        })

    } else {
        alert("Hay uno o varios campo/s faltante/s, por favor, llene todos los campos.")
    }

})