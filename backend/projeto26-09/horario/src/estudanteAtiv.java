import java.util.Scanner;

public class estudanteAtiv {
    public static void main(String[] args) {
        int idade;
        String con;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Você é estudante? Responda com 'S' ou 'N'.");
        con = entrada.nextLine();
        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();

        if (idade >= 18 && (con.equalsIgnoreCase("S"))) {
            System.out.println("Você receberá o desconto, pois você é estudante.");


            } else {
                System.out.println("Você não é estudante, portanto, não receberá o desconto.");
            }

    }
}
