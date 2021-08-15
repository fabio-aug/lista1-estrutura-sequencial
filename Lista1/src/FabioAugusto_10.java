import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_10 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe o fundo investido (R$ - EX: 2000.0): ");
        double value = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o rendimento ao mês (EX: 0.5): ");
        double income = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o tempo em mês (EX: 1 ano = 12 meses): ");
        double time = keyCaps.nextInt();
        double accumulation = value * (1 + income) * time;
        System.out.println("\nO valor acumulado é R$" + accumulation);
    }

}
