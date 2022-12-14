## Sesión 2: Patrón Decorador

### 🎯 OBJETIVO

- Estudiar y resolver un problema utilizando el patrón Decorador

### DESARROLLO

Una cadena de helados muy famosa en el país ha solicitado tu ayuda para implementar una nueva versión de su sistema actual. 

Sus productos disponibles son los siguientes:

- Helado Suave	**$30**
- Con Cobertura	**$20 extra**
- Con Granola 	**$10 extra**
- Con Topping	**$20 extra**

El sistema actualmente está diseñado con Programación Orientada a Objetos usando el lenguaje Java y tienen una clase por cada variante de los productos, como se muestra a continuación:

```java
class HeladoSuave {
  //...
}

class HeladoSuaveConCobertura {
  // ...
}

class HeladoSuaveConGranola {
  // ...
}

class HeladoSuaveConTopping {
  // ...
}

class HeladoSuaveConCoberturaYToping {
  // ...
}

class HeladoSuaveConToppingYGranola {
  // ...
}

class HeladoSuaveConCoberturaYGranola {
  // ...
}
```

La cadena busca agregar nuevos extras:

- Con Mermelada	**$10 extra**
- Con Galleta		**$15 extra**
 
La inclusión de estos productos complica el desarrollo del sistema actual debido a que habría que agregar todas las variantes de los productos viejos con los nuevos. Por lo tanto el sistema **no es mantenible**.

Tú misión será crear la nueva versión del sistema utilizando el patrón Decorador de los patrones estructurales, así como un programa que permita probar la nueva implementación.

| Requisito    | Sí lo cumple    | No lo cumple    |
| --- | --- | --- |
| A. Archivo de configuración gradle.build para compilar y ejecutar el programa    |  ✔️   |     | 
| B. Clases que reflejan la implementación con el patrón Decorador    | ✔️    |     |
| C. Programa que permite probar las clases creadas    |  ✔️   |     |

