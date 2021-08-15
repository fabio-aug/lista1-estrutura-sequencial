import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_20 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o salário mínimo: ");
        double baseSalary = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double hours = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a quantidade de hora extra trabalhada: ");
        double extra = Double.parseDouble(keyCaps.nextLine());
        double a = baseSalary * (0.125 / 100); /* Valor a ser pago por hora trabalhada */
        double b = baseSalary * (0.25 / 100); /* Valor a ser pago por hora extra trabalhada */
        double c = hours * a; /* Salário bruto */
        double d = extra * b; /* Salário extra */
        double e = c + d; /* Salário extra */
        System.out.println("\nO salário a receber é: " + e);
    }

}
