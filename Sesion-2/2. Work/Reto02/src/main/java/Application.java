import java.util.Scanner;
import java.util.Stack;
public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int option = 0;

        Stack<Comando> pila = new Stack<>();

        while(option !=5) {
            System.out.println("\n*** Valor actual: " + counter + " ***");
            System.out.println("\nElige alguna opción: ");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    // System.out.println("--- Incrementar contador en 1 ---");
                    // counter += 1;
                    ComandoAdd1 comando1 = new ComandoAdd1(counter, 1);
                    counter = comando1.ejecutar();
                    pila.add(comando1);
                    break;
                case 2:
                    //System.out.println("--- Multiplicar contador por 2 ---");
                    //counter *= 2;
                    ComandoMultiplicar comando2 = new ComandoMultiplicar(counter, 2);
                    counter = comando2.ejecutar();
                    pila.add(comando2);
                    break;
                case 3:
                    //System.out.println("--- Añadir 10 al contador ---");
                    //counter +=10;
                    ComandoAdd10 comando3 = new ComandoAdd10(counter, 10);
                    counter = comando3.ejecutar();
                    pila.add(comando3);
                    break;
                case 4:
                    // Deshacer ultimo cambio
                    if (!pila.isEmpty()){
                        Comando ultimo = pila.pop();
                        counter = ultimo.deshacer();
                    } else {
                        System.out.println("\n ~~~~ No hay nada por deshacer. ~~~~~");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    option = 5;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
