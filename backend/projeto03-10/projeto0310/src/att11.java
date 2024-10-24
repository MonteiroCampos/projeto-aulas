import java.util.Scanner;

public class att11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a sua nota: ");
        double nota = entrada.nextDouble();

        System.out.print("Insira a sua frequência em %: ");
        int frequencia = entrada.nextInt();

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Você foi aprovado!");
        } else if (frequencia < 75) {
            System.out.println("Você foi reprovado!");
        } else if (nota >= 6 && nota < 7 && frequencia >= 75) {
            System.out.println("Você está em recuperação!");
        } else {
            System.out.println("Curso e nivelamento completo, parabéns!");
        }

        entrada.close();
    }
}