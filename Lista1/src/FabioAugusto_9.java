import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_9 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o número de lados do polígono: ");
        int numberSides = keyCaps.nextInt();
        int numberDiagonals = numberSides * (numberSides - 3) / 2;
        System.out.println("O polígono tem " + numberDiagonals + " diagonais");
    }

}
