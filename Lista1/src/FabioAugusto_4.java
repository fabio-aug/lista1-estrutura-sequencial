import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_4 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double number1 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o primeiro peso: ");
        double weight1 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o segundo número: ");
        double number2 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o segundo peso: ");
        double weight2 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o terceiro número: ");
        double number3 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o terceiro peso: ");
        double weight3 = Double.parseDouble(keyCaps.nextLine());
        double weightedAverage = (number1 * weight1 + number2 * weight2 + number3 * weight3) / (weight1 + weight2 + weight3);
        System.out.println("Resultado da média ponderada é : " + weightedAverage);
    }

}
