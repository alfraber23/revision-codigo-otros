const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('#name'); // cambiamos el selector para buscar un elemento con id "name" en lugar de una etiqueta "name"
const $b = document.querySelector('#blog');
const $l = document.querySelector('.location');

async function displayUser(username) {
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`); // agregamos "await" para esperar la respuesta de la promesa
  const data = await response.json(); // parseamos la respuesta en formato json
  console.log(data);
  $n.textContent = data.name; // asignamos el valor directamente sin usar interpolación de cadenas de templates
  $b.textContent = data.blog;
  $l.textContent = data.location;
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  $n.textContent = `Algo salió mal: ${err}` // corregimos la ortografía en la variable
}

displayUser('stolinski').catch(handleError);
