## Sesi贸n 2: Patr贸n Decorador

### 馃幆 OBJETIVO

- Estudiar y resolver un problema utilizando el patr贸n Decorador

### DESARROLLO

Una cadena de helados muy famosa en el pa铆s ha solicitado tu ayuda para implementar una nueva versi贸n de su sistema actual. 

Sus productos disponibles son los siguientes:

- Helado Suave	**$30**
- Con Cobertura	**$20 extra**
- Con Granola 	**$10 extra**
- Con Topping	**$20 extra**

El sistema actualmente est谩 dise帽ado con Programaci贸n Orientada a Objetos usando el lenguaje Java y tienen una clase por cada variante de los productos, como se muestra a continuaci贸n:

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
 
La inclusi贸n de estos productos complica el desarrollo del sistema actual debido a que habr铆a que agregar todas las variantes de los productos viejos con los nuevos. Por lo tanto el sistema **no es mantenible**.

T煤 misi贸n ser谩 crear la nueva versi贸n del sistema utilizando el patr贸n Decorador de los patrones estructurales, as铆 como un programa que permita probar la nueva implementaci贸n.

| Requisito    | S铆 lo cumple    | No lo cumple    |
| --- | --- | --- |
| A. Archivo de configuraci贸n gradle.build para compilar y ejecutar el programa    |  鉁旓笍   |     | 
| B. Clases que reflejan la implementaci贸n con el patr贸n Decorador    | 鉁旓笍    |     |
| C. Programa que permite probar las clases creadas    |  鉁旓笍   |     |

