import java.util.Scanner;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_12 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe a meta a ser caminhada: ");
        double target = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a mediada da rua A: ");
        double streetA = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a mediada da rua B: ");
        double streetB = Double.parseDouble(keyCaps.nextLine());
        double streetC = sqrt((streetA * streetA) + (streetB * streetB));
        System.out.println("Dona Maria devera dar " + round(streetC / target) + " voltas no quarteirão.");
    }

}
