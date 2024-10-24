import java.util.Scanner;

public class A510 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("informe o número aqui: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("o número é negativo.");
        } else if (numero > 0) {
            System.out.println("o número é positivo.");
        } else {
            System.out.println("o número é zero.");
        }

        entrada.close();
    }
}