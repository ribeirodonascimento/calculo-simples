import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int cod1 = s.nextInt();
        int numPecas1 = s.nextInt();
        double valor1 = s.nextDouble();
        double total1 = valor1 * numPecas1;
        int cod2 = s.nextInt();
        int numPecas2 = s.nextInt();
        double valor2 = s.nextDouble();
        double total2 = valor2 * numPecas2;
        double valorTotal = total1 + total2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotal);
    }
}