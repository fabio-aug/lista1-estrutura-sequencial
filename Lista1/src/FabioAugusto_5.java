import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_5 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o salário base: ");
        double baseSalary = Double.parseDouble(keyCaps.nextLine());
        double salaryBonus = baseSalary + (baseSalary * 0.10);
        double salaryFinal = salaryBonus - (salaryBonus * 0.05);
        System.out.println("O salário a receber é: " + salaryFinal);
    }

}
