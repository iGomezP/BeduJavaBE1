import java.util.Scanner;

public class RetoBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número a convertir en binario: ");
        String entrada = sc.nextLine();
        int numero = Integer.parseInt(entrada);
        String numeroBinario = Integer.toBinaryString(numero);

        System.out.println("El número " + numero + " convertido a binario es: "+ numeroBinario);
    }
}
