import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_22 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        double a = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o valor de B: ");
        double b = Double.parseDouble(keyCaps.nextLine());
        double aux = a;
        a = b;
        b = aux;
        System.out.println("\nA: " + a + "\nB: " + b);
    }

}
