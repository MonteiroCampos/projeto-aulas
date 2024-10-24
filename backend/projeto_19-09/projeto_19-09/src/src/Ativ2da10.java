import java.util.Scanner;

public class Ativ2da10 {
    public static void main (String[]args) {

        int nota;
        System.out.println("qual a sua nota final?");
        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextInt();


        if (nota >= 6) {

            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

         