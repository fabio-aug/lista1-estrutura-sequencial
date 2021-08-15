import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_1 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int number1 = keyCaps.nextInt();
        System.out.print("Informe o segundo número: ");
        int number2 = keyCaps.nextInt();
        System.out.print("Informe o terceiro número: ");
        int number3 = keyCaps.nextInt();
        int media = (number1 + number2 + number3) / 3;
        System.out.println("Resultado da média é: " + media);
    }

}
