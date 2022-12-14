package comportamiento;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        float resultado = 0;
        boolean salir = false;
        // Leer cosas de la terminal
        Scanner sc = new Scanner(System.in);
        Stack<Comando> pila = new Stack<>();

        while (!salir) {
            System.out.println("\nRESULTADO = "+resultado);
            System.out.println("\nCALCULADORA");
            System.out.println("a. Sumar");
            System.out.println("b. Restar");
            System.out.println("c. Multiplicar");
            System.out.println("d. Dividir");
            System.out.println("e. Deshacer último cambio");
            System.out.println("f. Salir");

            String opcion = sc.nextLine();
            float entrada;

            switch (opcion) {
                case "a":
                    System.out.println("Ingresa un número: ");
                    entrada = sc.nextFloat();
                    //resultado += entrada;
                    ComandoSumar comando = new ComandoSumar(resultado, entrada);
                    resultado = comando.ejecutar();
                    pila.add(comando);
                    break;

                case "b":
                    System.out.println("Ingresa un número: ");
                    entrada = sc.nextFloat();
                    //resultado -= entrada;
                    ComandoRestar comando2 = new ComandoRestar(resultado, entrada);
                    resultado = comando2.ejecutar();
                    pila.add(comando2);
                    break;

                case "c":
                    System.out.println("Ingresa un número: ");
                    entrada = sc.nextFloat();
                    //resultado *= entrada;
                    ComandoMultiplicar comando3 = new ComandoMultiplicar(resultado, entrada);
                    resultado = comando3.ejecutar();
                    pila.add(comando3);
                    break;

                case "d":
                    System.out.println("Ingresa un número: ");
                    entrada = sc.nextFloat();
                    //resultado /= entrada;
                    ComandoDividir comando4 = new ComandoDividir(resultado, entrada);
                    resultado = comando4.ejecutar();
                    pila.add(comando4);
                    break;

                case "e":
                    if (!pila.isEmpty()) {
                        Comando ultimo = pila.pop();
                        resultado = ultimo.deshacer();
                    } else {
                        System.out.println("No hay nada por deshacer");
                    }
                    break;

                case "f":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        System.out.println("Resultado final: " + resultado);
    }
}
