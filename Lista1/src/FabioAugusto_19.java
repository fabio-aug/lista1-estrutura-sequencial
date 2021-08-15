import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_19 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = keyCaps.nextInt();
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double squareRoot = Math.sqrt(number);
        double cuberRoot = Math.cbrt(number);
        System.out.println("\nNúmero: " + number);
        System.out.println("O número elevado ao quadrado: " + square);
        System.out.println("O número elevado ao cubo: " + cube);
        System.out.println("A raiz quadrada do número: " + squareRoot);
        System.out.println("A raiz cúbica do número: " + cuberRoot);
    }

}
