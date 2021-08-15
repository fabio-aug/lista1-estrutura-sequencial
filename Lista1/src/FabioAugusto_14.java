import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_14 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o comprimento: ");
        double length = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a largura: ");
        double width = Double.parseDouble(keyCaps.nextLine());
        double potency = (length * width) * 18;
        System.out.println("A potência necessária para iluminar o cômodo é " + potency + " Watts");
    }

}
