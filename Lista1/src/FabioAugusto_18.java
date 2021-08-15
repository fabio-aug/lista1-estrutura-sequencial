import java.util.Scanner;


/* Fábio Augusto Araújo Santos */

public class FabioAugusto_18 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o salário base: ");
        double baseSalary = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o quilowatt gasto: ");
        double quilowattUsed = Double.parseDouble(keyCaps.nextLine());
        double a = baseSalary / 5;
        double b = quilowattUsed * a;
        double c = b - (b * 0.15);
        System.out.println("\nO valor pago por quilowatt: R$" + a);
        System.out.println("O valor a ser pago pelo consumo nessa residência: R$" + b);
        System.out.println("O valor a ser pago considerando um desconto de 15%: R$" + c);
    }

}
