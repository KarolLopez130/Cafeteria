//REDIRECCIONAR A LA PAGINA DE CARRITO CON AJAX

$(document).ready(function(){

    $('#btnGuardarUsuario').on('click', function(){
        var esperar = 2000;
        $.ajax({

            success: function(){
                location.href = "carrito/carrito.html"
            },esperar
        
        });

    })

});




