## Reto 01: Persistencia de datos con Spring Data JPA

### OBJETIVO

- Obtener información almacenada en la base de datos.
- Hacer uso de las anotaciones básicas de JPA para indicar qué objeto debe ser tratado como una entidad de base de datos.
- Aprender qué es un repositorio y los métodos por default que ofrece.


### DESARROLLO

- Crea un nuevo proyecto usando Spring Initilizr y agrega las dependencias de `Spring Web`, `Spring Data JPA` y `MySQL Driver`.
![Paso1](./img/Paso1.png)
- Crea los subpaquetes: `controller`, `model` y `persistence`.
![Paso2](./img/Paso2.png)
- Crea una clase `Producto` y coloca las anotaciones correspondientes JPA.
![Paso3](./img/Paso3.png)
- Crea una clase `ProductoRepository` que extienda de `JpaRepository`.
![Paso4](./img/Paso4.png)
- Crea una clase `ProductoController` que haga uso de la interface anterior.
![Paso5](./img/Paso5.png)
- Implementa las funcionalidades de guardar un nuevo objeto Producto usando un método POST.
![Paso6](./img/Paso6.png)
- Implementa un método GET que reciba el ID de un objeto Producto y lea el objeto correspondiente de la base de datos. Si no se encuentra el objeto con el ID correspondiente se deberá regresar un error 404.
![Paso7](./img/Paso7.png)
- Realiza la prueba del reto usando Postman.
![Paso8.1](./img/Paso8-1.png)
![Paso8.2](./img/Paso8-2.png)
![Paso8.3](./img/Paso8-3.png)

