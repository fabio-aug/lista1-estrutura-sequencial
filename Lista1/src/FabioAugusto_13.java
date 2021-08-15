import java.util.Scanner;

import static java.lang.Math.round;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_13 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o ano atual: ");
        double year = keyCaps.nextInt();
        double numCups = ((year - 1930) / 4) - 2;
        System.out.println("Já foram realizadas " + round(numCups) + " copas");
    }

}
