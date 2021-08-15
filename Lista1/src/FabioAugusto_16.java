import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_16 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe a quantidade de minutos: ");
        int value = keyCaps.nextInt();
        int minutes = value % 60;
        int hours = (value - minutes) / 60;
        System.out.println("\n" + hours + " horas e " + minutes + " minutos");
    }

}
