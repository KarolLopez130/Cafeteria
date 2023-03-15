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
      nombre: 'Mocha Latte',
      precio: '8000',
      descripcion: 'Espresso 100% colombiano con leche vaporizada a la perfección y salsa de chocolate.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FMOCHA%20LATTE-12.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    producto4: {
      nombre: 'Dolce Canela Latte',
      precio: '6000',
      descripcion: 'Espresso colombiano con leche vaporizada, jarabe de canela dulce.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FDOLCE%20CANELA%20LATTE-07.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
    producto5: {
      nombre: 'Arequipe Latte',
      precio: '7000',
      descripcion: 'Espresso 100% colombiano con leche vaporizada a la perfección, combinado con salsa de arequipe, terminado con espiral de caramelo.',
      srcImg: 'https://djftrby1k8irl.cloudfront.net/s3fs-public/2022-03%2FAREQUIPE%20LATTE-02.png?auto=format,compress&q=70&crop=focalpoint&ar=1:1.0&w=180&fit=crop'
    },
  }
// Se captura el template de los productos
const templateProd = document.getElementById('template-prod').content
const contenedorProd = document.querySelector('.contenedor-cafes')
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