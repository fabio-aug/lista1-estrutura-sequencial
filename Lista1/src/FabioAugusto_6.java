import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_6 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o salário base: ");
        double baseSalary = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o valor de vendas: ");
        double bandageValue = Double.parseDouble(keyCaps.nextLine());
        double salaryBonus = baseSalary + (bandageValue * 0.04);
        System.out.println("O benefício a ser recebido é: " + salaryBonus);
    }

}
