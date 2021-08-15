import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_23 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe a quantidade de pessoas entrevistadas: ");
        int pessoas = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem a novela A: ");
        int a = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem a novela B: ");
        int b = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem a novela C: ");
        int c = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem as novelas A e B: ");
        int ab = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem as novelas A e C: ");
        int ac = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem as novelas B e C: ");
        int bc = keyCaps.nextInt();
        System.out.print("Quantidade de pessoas que assistem as novelas A, B e C: ");
        int abc = keyCaps.nextInt();
        int total = pessoas - ((ab - abc) + ac - abc) + (bc - abc) + (a - (ab - abc) - (ac - abc)) + (b - (ab - abc) - abc - (bc - abc)) + (c - abc - (ac - abc) - (bc - abc));
        System.out.println("Número de telespectadores que nenhuma das novelas os agradam: " + total);
    }

}
