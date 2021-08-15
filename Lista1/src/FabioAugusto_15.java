import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_15 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double radius = Double.parseDouble(keyCaps.nextLine());
        double pi = 3.1416;
        double circumference = 2 * pi * radius;
        System.out.println("A área de circunferência é " + circumference);
    }

}
