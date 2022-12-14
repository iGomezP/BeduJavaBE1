## Reto 02: Controladores con Spring MVC con parámetros

### OBJETIVO

- Aprender la forma de crear controladores de Spring usando su módulo web (Spring MVC) y recibir un parámetro.
- Crear un servicio REST que regrese un recurso dinámico.
- Consumir el servicio usando un navegador Web y con Postman.

### DESARROLLO

En el ejemplo anterior creamos un controlador que regresaba un mensaje estático predeterminado, lo que quiere decir que no importa cuantas veces llamemos al recurso siempre recibimos la misma respuesta. 

En este reto tendrás que modificar el controlador creado en el ejemplo anterior para que reciba un parámetro que interpretará como el nombre de la persona a la que estamos saludando. El objetivo es poder saludar a un usuario usando su nombre, por lo que la salida deberá ser similar a la siguiente:
![ejemplo](./img/ejemplo01.png)
***

## RESULTADO:

1. Modificar el controlador y el modelo creados en el ejemplo anterior para que reciba un parámetro que interpretará como el nombre de la persona a la que estamos saludando:<details>
		<summary>SaludoController.java</summary>
	
	![Reto2.1](./img/Reto2_01.png)
	</details>
	<details> 
		<summary> Saludo.java </summary>
	
	![Reto2.2](./img/Reto2_02.png)
	</details>


2. Deberás validar el correcto funcionamiento de la aplicación usando la herramienta Postman y desde el navegador:
	<details>
		<summary> Resultado de Insomnia (alternativa a Postman) </summary>
	
	![Reto2.3](./img/Reto2_03.png)
	</details>
