arregloCafes = []

// METODO GET
$(document).ready(function(){

    const templateLCafe = document.querySelector('#CafeLinea').content;
    const tablaLCafes = document.querySelector('#datosForm');
    const fragmentLC = document.createDocumentFragment();
    
    $.ajax({

      url: "http://localhost:8080/MostrarCafes",
      type: "GET",
      datatype: "JSON",

      success: function(response){
        iterador = 0
        Object.values(response).forEach( producto => {
          arregloCafes[iterador] = producto
          templateLCafe.querySelector('.idCafe').textContent = producto['codigo']
          templateLCafe.querySelector('.nombre').textContent = producto['nombre']
          templateLCafe.querySelector('.tipo').textContent = producto['tipo']
          templateLCafe.querySelector('.descripcion').textContent = producto['descripcion']
          templateLCafe.querySelector('.precio').textContent = producto['precio']
          templateLCafe.querySelector('.imagen').setAttribute('href', producto['imagen'])
          templateLCafe.querySelector('.btnUpdate').setAttribute('id', iterador)
          templateLCafe.querySelector('.btnEliminar').setAttribute('id', iterador)
          const clone = templateLCafe.cloneNode(true)
          fragmentLC.appendChild(clone)
          iterador++
        })
        tablaLCafes.appendChild(fragmentLC);
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
        borrarCafe(num)
    
    })
}

function plasmarDatos(index){

    document.querySelector('#codigo').setAttribute('value', arregloCafes[index]['codigo']);
    document.querySelector('#names').setAttribute('value', arregloCafes[index]['nombre']);
    document.querySelector('#tipo').setAttribute('value', arregloCafes[index]['tipo']);
    document.querySelector('#descripcion').setAttribute('value', arregloCafes[index]['descripcion']);
    document.querySelector('#precio').setAttribute('value', arregloCafes[index]['precio']);
    document.querySelector('#url').setAttribute('value', arregloCafes[index]['imagen']);


}

// METODO PUT

$('#btnActualizar').on('click', function(){

    if ($('#names').val() != "" && $('#tipo').val() != "" && $('#descripcion').val() != "" && $('#precio').val() != 0 && $('#url').val() != ""){


        let Cafe = {

            codigo: $('#codigo').val(),
            nombre: $('#names').val(),
            tipo: $('#tipo').val(),
            descripcion: $('#descripcion').val(),
            precio: parseInt($('#precio').val()),
            imagen: $('#url').val(),

        }

        let CafeActualizar = JSON.stringify(Cafe);
        console.log(Cafe)
        console.log(CafeActualizar)
        $.ajax({

            url: "http://localhost:8080/ActualizarCafe",
            type: "PUT",
            data: CafeActualizar,
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

function borrarCafe(index){

    let cafesito = {

        codigo: arregloCafes[index]['codigo'],

    }

    let cafeEliminar = JSON.stringify(cafesito);
    $.ajax({

        url: "http://localhost:8080/BorrarCafe",
        type: "DELETE",
        data: cafeEliminar,
        contentType: "application/JSON",
        dataType: "JSON",

        success: function(response){
            alert(response);
        }

    })

}

