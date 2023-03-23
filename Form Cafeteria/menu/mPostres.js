// METODO GET
$(document).ready(function(){

    
    const templatePostre = document.querySelector('#template-postre').content;
    const contenedorPostres = document.querySelector('.contenedor-postres');
    const fragmentP = document.createDocumentFragment();
    
    $.ajax({

      url: "http://localhost:8080/MostrarPostres",
      type: "GET",
      datatype: "JSON",

      success: function(response){
        console.log(response);
        Object.values(response).forEach( producto => {
          templatePostre.querySelector('.div-info .nombre-prod').textContent = producto['nombre']
          templatePostre.querySelector('.div-precio-boton .precio').textContent = producto['precio']
          templatePostre.querySelector('.div-info .descripcion-prod').textContent = producto['descripcion']
          templatePostre.querySelector('.contenedor-img img').setAttribute('alt', producto['nombre'])
          templatePostre.querySelector('.contenedor-img img').setAttribute('src', producto['imagen'])
          const clone = templatePostre.cloneNode(true)
          fragmentP.appendChild(clone)
        })
        contenedorPostres.appendChild(fragmentP)

      }

    })

})

