import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Valor em Meticais: ");
        double value = sc.nextDouble();

        double v_sale;

        if (value < 340) {
            v_sale = value * 1.45; // 45% de lucro
        } else if (value >= 340 && value < 680) {
            v_sale = value * 1.35; // 35% de lucro
        } else if (value >= 680 && value < 1020) {
            v_sale = value * 1.25; // 25% de lucro
        } else {
            v_sale = value * 1.15; // 15% de lucro 
        }

        System.out.printf("O valor de venda será: %.2f Mt%n", v_sale);

        sc.close();
    }
}
