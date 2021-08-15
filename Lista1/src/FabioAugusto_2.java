import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_2 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int number = keyCaps.nextInt();
        int before = number - 1;
        int after = number + 1;
        System.out.println("Antecessor: " + before);
        System.out.println("Sucessor: " + after);
    }

}
