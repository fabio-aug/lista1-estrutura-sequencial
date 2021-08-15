import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_17 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o número real: ");
        double number = Double.parseDouble(keyCaps.nextLine());
        int integer = (int) number;
        double fractional = (number - integer);
        System.out.println("\nParte inteira: " + integer);
        System.out.println("Parte fracionaria: " + fractional);
    }

}
