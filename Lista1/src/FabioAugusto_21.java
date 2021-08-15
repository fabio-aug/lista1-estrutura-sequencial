import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_21 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o angulo: ");
        double angle = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a altura: ");
        double height = Double.parseDouble(keyCaps.nextLine());
        int hypotenuse = (int) (height / Math.sin(Math.toRadians(angle)));
        System.out.println("\nA medida da escada vai ser: " + hypotenuse);
    }

}
