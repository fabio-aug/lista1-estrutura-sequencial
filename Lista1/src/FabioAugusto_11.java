import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_11 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o salário: ");
        double salary = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o valor da primeira conta: ");
        double account1 = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o valor da segunda conta: ");
        double account2 = Double.parseDouble(keyCaps.nextLine());
        double result = salary - ((account1 + (account1 * 0.02)) + (account2 + (account2 * 0.02)));
        System.out.println("Restara R$" + result + " do salário");
    }

}
