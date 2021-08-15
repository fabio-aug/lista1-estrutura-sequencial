import java.util.Scanner;

/* Fábio Augusto Araújo Santos */

public class FabioAugusto_7 {

    public static void main(String[] args) {
        Scanner keyCaps = new Scanner(System.in);
        System.out.print("Informe a altura do retângulo: ");
        double height = Double.parseDouble(keyCaps.nextLine());
        System.out.print("Informe a largura do retângulo: ");
        double width = Double.parseDouble(keyCaps.nextLine());
        double area = height * width;
        double perimeter = (2 * height) + (2 * width);
        System.out.println("\nA área do retângulo é: " + area + "\nO perímetro do retângulo é: " + perimeter);
    }

}
