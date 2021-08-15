import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_8 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe a base menor do terreno: ");
        double smallerBase = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a maior base do terro: ");
        double largerBase = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a altura do terro: ");
        double height = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe o valor por metro quadrado: ");
        double value = Double.parseDouble(keyCaps.nextLine());
        double area = ((smallerBase + largerBase) * height) / 2;
        double media = area * value;
        System.out.println("\nÁrea total: " + area + " metros quadrados\nValor médio: R$" + media);
    }

}
