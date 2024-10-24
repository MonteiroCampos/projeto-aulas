import java.util.Scanner;

public class Ativ1da10 {
    public static void main(String[] args) {
        int idade;
        String con;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();

        if (idade >= 18 ) {
            System.out.println("Você é maior de idade");
        } else {

            System.out.println("Você não é maior de idade");
        }
    }
}

