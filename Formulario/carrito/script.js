// Array de productos
const productos = {
    producto1: {
      nombre: 'Mocha Blanco Latte',
      precio: '8000',
      descripcion: 'Espresso 100% colombiano con leche vaporizada, salsa de mocha blanco',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FMOCHA%20BLANCO-11.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    producto2: {
      nombre: 'Latte',
      precio: '9000',
      descripcion: 'Espresso colombiano con leche vaporizada, ligeramente cubierto con espuma.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FLATTE-09.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    producto3: {
      nombre: 'Dolce Canela Latte',
      precio: '6000',
      descripcion: 'Espresso colombiano con leche vaporizada, jarabe de canela dulce.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FDOLCE%20CANELA%20LATTE-07.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    producto4: {
      nombre: 'Arequipe Latte',
      precio: '7000',
      descripcion: 'Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FAREQUIPE%20LATTE-02.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    
      producto5: {
      nombre: 'Rollo Canela',
      precio: '6000',
      descripcion: 'Exquisito rollo francés relleno de canela.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-02%2FRollo-canela_1.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
      producto6: {
      nombre: 'Muffin de Chocolate',
      precio: '5500',
      descripcion: 'Muffin de chocolate, horneado con trozos de chocolate.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-02%2FMuffin-chocolate_1.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
      producto7: {
      nombre: 'Muffin Arándano',
      precio: '5500',
      descripcion: 'Muffin de arandanos y vainilla.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-02%2FMUFF%201_1.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
     producto8: {
      nombre: 'Arepa con Queso',
      precio: '5000',
      descripcion: 'Arepa de maíz con queso y margarina.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2023-02%2FAREPA_DE_QUESO.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
  }
  // Se captura el template de los productos
  const templateProd = document.getElementById('template-prod').content
  const contenedorProd = document.querySelector('.contenedor-productos')
  const fragment = document.createDocumentFragment()

  
  
  
  // TODO LO RELACIONADO A AGREGAR LOS PRODUCTOS AL DOM
  Object.values(productos).forEach( producto => {
    templateProd.querySelector('.div-info .nombre-prod').textContent = producto.nombre
    templateProd.querySelector('.div-precio-boton .precio').textContent = producto.precio
    templateProd.querySelector('.div-info .descripcion-prod').textContent = producto.descripcion
    templateProd.querySelector('.contenedor-img img').setAttribute('alt', producto.nombre)
    templateProd.querySelector('.contenedor-img img').setAttribute('src', producto.srcImg)
    const clone = templateProd.cloneNode(true)
    fragment.appendChild(clone)
  })
  contenedorProd.appendChild(fragment)
  
  // TODO LO RELACIONADO AL CARRITO DE COMPRA
  let carrito = {}
  const templateTabla = document.getElementById('agregar-producto-al-carro').content
  const tbodyCarrito = document.getElementById('carrito-body')
  const fragmentTabla = document.createDocumentFragment()
  const templateFoot = document.getElementById('tfooter').content
  const tfootCarrito = document.getElementById('footer')
  
  contenedorProd.addEventListener('click', e => {
    
    if(e.target.textContent === "Agregar") {
      setCarrito(e.target.parentElement.parentElement)
    }
    e.stopPropagation();
  })
  const setCarrito = e => {
    const pivoteCarrito = {
      nombre: e.querySelector('.div-info .nombre-prod').textContent,
      precio: e.querySelector('.div-precio-boton .precio').textContent,
      cantidad: 1
    }
    if(carrito.hasOwnProperty(pivoteCarrito.nombre)){
      carrito[pivoteCarrito.nombre].cantidad += 1
    } else {
      carrito[pivoteCarrito.nombre] = {...pivoteCarrito}
    }
    pintarTabla(carrito)
  }
  
  const pintarTabla = objetoCarrito => {
    Object.values(objetoCarrito).forEach( objeto => {
      const cloneTabla = templateTabla.cloneNode(true)
      cloneTabla.getElementById('producto').textContent = objeto.nombre
      cloneTabla.getElementById('cant').textContent = objeto.cantidad
      cloneTabla.getElementById('precio-uni').textContent = objeto.precio
      let precioTotal = parseFloat(objeto.precio) * objeto.cantidad
      cloneTabla.getElementById('precio-total-prod').textContent = precioTotal.toFixed(2)
      fragmentTabla.appendChild(cloneTabla)
    })
    tbodyCarrito.innerHTML = ''
    tbodyCarrito.appendChild(fragmentTabla)
    pintarFooter()
  }
  
  const pintarFooter = () => {
    tfootCarrito.innerHTML = ''
    if(Object.keys(carrito).length === 0) {
      tfootCarrito.innerHTML = '<tr><td colspan = 4>¡No hay ningun elemento en el carrito!</td></tr>'
    } else {
      const total = Object.values(carrito).reduce((acc, {cantidad, precio}) => acc + (cantidad * precio),0)
      templateFoot.getElementById('total-a-pagar').textContent = total.toFixed(2)
      const cloneFoot = templateFoot.cloneNode(true)
      fragment.appendChild(cloneFoot)
      tfootCarrito.appendChild(fragment)
      //Boton Vaciar carrito
      const botonVaciar = document.getElementById('vaciar-tabla')
  botonVaciar.addEventListener('click', () => {
        carrito = {}
        pintarTabla(carrito)
        pintarFooter()
      })
      
      //Botones aumentar y disminuir cantidades
      
    }
  }
  tbodyCarrito.addEventListener('click', e => {
    
    if(e.target.classList.contains('button')) {
      aumentarDisminuir(e.target)
    }
  })
  const aumentarDisminuir = boton => {
    if(boton.textContent === '+'){
      const indicador = boton.parentElement.parentElement.firstElementChild.textContent
      Object.values(carrito).forEach( elemento => {
        if(elemento.nombre === indicador) {
        carrito[elemento.nombre].cantidad++  
        }
      })
    }
    if(boton.textContent === '-') {
      const indicador = boton.parentElement.parentElement.firstElementChild.textContent
      Object.values(carrito).forEach( elemento => {
        if(elemento.nombre === indicador) {
        carrito[elemento.nombre].cantidad--
          if(carrito[elemento.nombre].cantidad === 0) {
            delete carrito[elemento.nombre]
          }
        }
      })
    }
    pintarTabla(carrito)
    pintarFooter()
  }
  