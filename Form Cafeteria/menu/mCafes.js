$(document).ready(function(){

  const templateCafe = document.querySelector('#template-cafe').content;
  const contenedorCafes = document.querySelector('.contenedor-cafes');
  const fragmentC = document.createDocumentFragment();

  $.ajax({

    url: "http://localhost:8080/MostrarCafes",
    type: "GET",
    datatype: "JSON",

    success: function(response){
      console.log(response);
      Object.values(response).forEach( producto => {
        templateCafe.querySelector('.div-info .nombre-prod').textContent = producto['nombre']
        templateCafe.querySelector('.div-precio-boton .precio').textContent = producto['precio']
        templateCafe.querySelector('.div-info .descripcion-prod').textContent = producto['descripcion']
        templateCafe.querySelector('.contenedor-img img').setAttribute('alt', producto['nombre'])
        templateCafe.querySelector('.contenedor-img img').setAttribute('src', producto['imagen'])
        const clone = templateCafe.cloneNode(true)
        fragmentC.appendChild(clone)
      })
      contenedorCafes.appendChild(fragmentC)

    }

  })

})
