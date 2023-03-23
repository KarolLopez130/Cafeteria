arregloPostres = []

// METODO GET
$(document).ready(function(){

    const templateLPostre = document.querySelector('#postreLinea').content;
    const tablaLPostres = document.querySelector('#datosForm');
    const fragmentLP = document.createDocumentFragment();
    
    $.ajax({

      url: "http://localhost:8080/MostrarPostres",
      type: "GET",
      datatype: "JSON",

      success: function(response){
        iterador = 0
        Object.values(response).forEach( producto => {
          arregloPostres[iterador] = producto
          templateLPostre.querySelector('.idPostre').textContent = producto['codigo']
          templateLPostre.querySelector('.nombre').textContent = producto['nombre']
          templateLPostre.querySelector('.tipo').textContent = producto['tipo']
          templateLPostre.querySelector('.descripcion').textContent = producto['descripcion']
          templateLPostre.querySelector('.precio').textContent = producto['precio']
          templateLPostre.querySelector('.imagen').setAttribute('href', producto['imagen'])
          templateLPostre.querySelector('.btnUpdate').setAttribute('id', iterador)
          templateLPostre.querySelector('.btnEliminar').setAttribute('id', iterador)
          const clone = templateLPostre.cloneNode(true)
          fragmentLP.appendChild(clone)
          iterador++
        })
        tablaLPostres.appendChild(fragmentLP);
        loadButtons();

      }

    })



})

function loadButtons(){
    $('.btnUpdate').on('click', function(){
        
        var num = this.getAttribute('id');
        console.log(num)
        plasmarDatos(num)
    
    });

    $('.btnEliminar').on('click', function(){
        
        var num = this.getAttribute('id');
        console.log(num)
        borrarPostre(num)
    
    })
}

function plasmarDatos(index){

    document.querySelector('#codigo').setAttribute('value', arregloPostres[index]['codigo']);
    document.querySelector('#names').setAttribute('value', arregloPostres[index]['nombre']);
    document.querySelector('#tipo').setAttribute('value', arregloPostres[index]['tipo']);
    document.querySelector('#descripcion').setAttribute('value', arregloPostres[index]['descripcion']);
    document.querySelector('#precio').setAttribute('value', arregloPostres[index]['precio']);
    document.querySelector('#url').setAttribute('value', arregloPostres[index]['imagen']);


}

// METODO PUT

$('#btnActualizar').on('click', function(){

    if ($('#names').val() != "" && $('#tipo').val() != "" && $('#descripcion').val() != "" && $('#precio').val() != 0 && $('#url').val() != ""){


        let postre = {

            codigo: $('#codigo').val(),
            nombre: $('#names').val(),
            tipo: $('#tipo').val(),
            descripcion: $('#descripcion').val(),
            precio: parseInt($('#precio').val()),
            imagen: $('#url').val(),

        }

        let postreActualizar = JSON.stringify(postre);
        console.log(postre)
        console.log(postreActualizar)
        $.ajax({

            url: "http://localhost:8080/ActualizarPostre",
            type: "PUT",
            data: postreActualizar,
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

// METODO DELETE

function borrarPostre(index){

    let postre = {

        codigo: arregloPostres[index]['codigo'],

    }

    let postreEliminar = JSON.stringify(postre);
    $.ajax({

        url: "http://localhost:8080/BorrarPostre",
        type: "DELETE",
        data: postreEliminar,
        contentType: "application/JSON",
        dataType: "JSON",

        success: function(response){
            alert(response);
        }

    })

}




