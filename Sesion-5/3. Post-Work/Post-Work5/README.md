## Sesión 5: Conexión a base de datos con Spring Data

### OBJETIVO

- Almacenar la información de la aplicación en una base de datos relacional MySQL o SQLite.
- Modificar los controladores de los servicios construidos hasta ahora en el proyecto para que utilicen la información de la base de datos.


### DESARROLLO

En esta sesión aprendimos a usar Spring Data JPA como mecanismo para realizar el trabajo en una base de datos relacional. Spring Data JPA hace uso de Hibernate como motor de persistencia y este realiza las conversiones entre objetos Java a tablas de la base de datos para que no tengamos que preocuparnos por escribir ni una sola línea de SQL.

### Asegúrate de comprender:
- Cómo integrar Spring Data JPA en un proyecto Spring Boot.
- La forma de configurar la conexión a la base de datos.
- Qué es una entidad, un repositorio, y cómo integrarlos en la aplicación.
 
### Indicaciones generales
En el Postwork de la sesión anterior le dimos a nuestra agenda una interfaz de usuario muy sencilla. Con ella ya podemos ingresar en un formulario la información de las personas, y recuperar la misma para mostrarla en una lista. Sin embargo, debido a que estamos usando un almacén en memoria, cada vez que reiniciamos la aplicación perdemos la información que ya habíamos guardado.
En esta ocasión tu misión será extender la aplicación que haz desarrollado hasta ahora siguiendo los puntos siguientes:
1. [Deberás integrar las dependencias de Spring data JPA y el driver de MySQL o SQLite en tu configuración.](./pom.xml)
2. [Definir el esquema de la base de datos que se usará en el proyecto.](./src/main/java/org/bedu/java/backend/ProyectoFinalModulo2/entity/Producto.java)
3. [Conectar la Base de datos con la aplicación.](./src/main/resources/application.properties)
4. [Modificar los servicios definidos en los controladores para que consuman o alteren la información almacenada en la base de datos. Siempre respetando el patrón MVC.](./src/main/java/org/bedu/java/backend/ProyectoFinalModulo2)

|  Requisito   |  Sí lo cumple   | No lo cumple    |
| --- | --- | --- |
|  A. Dependencias de Spring Data JPA y el driver de MySQL.   |  Si   |     |
|  B. Configuración de la base de datos en el archivo application.properties.   |  Si   |     |
|  C. Información almacenada y recuperada desde las tablas de la base de datos.   |  Si   |     |
| D. Agregar persistencia de datos en los servicios de la API usando la base de datos 	    | Si |     |
