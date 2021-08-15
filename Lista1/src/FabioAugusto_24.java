import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_24 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        int a = keyCaps.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = keyCaps.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = keyCaps.nextInt();
        int delta = (int) Math.pow(b, 2) + (-4 * a * c);
        if (delta < 0) {
            System.out.println("\nNão é possível raízes reais de delta negativo!!!\nDelta: " + delta);
        } else {
            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("\nDelta: " + delta + "\nX1: " + x1 + "\nX2: " + x2);
        }
    }

}
