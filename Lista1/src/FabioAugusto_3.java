import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_3 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double number1 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o segundo número: ");
        double number2 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o terceiro número: ");
        double number3 = Double.parseDouble(keyCaps.nextLine());
        double result = (number1 * number2) / number3;
        System.out.println("O resultado é: " + result);
    }

}
