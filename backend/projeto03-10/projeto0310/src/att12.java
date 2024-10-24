
import java.util.Scanner;
import java.util.Random;

public class att12 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        //0=pedra 1=papel 2=tesoura;

        int escolhaPC = gerador.nextInt(2);
        System.out.println("Sua escolha (pedra, papel, tesoura): ");
        String escolhaPc = entrada.nextLine();
        String resultado = "";
        String escolhaRandom = "";

        if (escolhaPc.equalsIgnoreCase("pedra")) {
            if (escolhaPC == 0) {
                resultado = "empate";
                escolhaRandom = "pedra";

            } else if (escolhaPC == 1) {
                resultado = "PC venceu";
                escolhaRandom = "papel";

            } else if (escolhaPC == 2) {
                resultado = "Usuário venceu";
                escolhaRandom = "tesoura";
            }
            System.out.println("Escolha do PC: " + escolhaRandom);

        } else if (escolhaPc.equalsIgnoreCase("papel")) {
            if (escolhaPC == 0) {
                resultado = "usuário venceu";
                escolhaRandom = "pedra";

            } else if (escolhaPC == 1) {
                resultado = "empate";
                escolhaRandom = "papel";

            } else if (escolhaPC == 2) {
                resultado = "PC venceu";
                escolhaRandom = "tesoura";

            }
            System.out.println("Escolha do PC: " + escolhaRandom);

        } else if (escolhaPc.equalsIgnoreCase("tesoura")) {
            if (escolhaPC == 0) {
                resultado = "PC venceu";
                escolhaRandom = "pedra";

            } else if (escolhaPC == 1) {
                resultado = "usuário venceu";
                escolhaRandom = "papel";

            } else if (escolhaPC == 2) {
                resultado = "empate";
                escolhaRandom = "tesoura";
            }
            System.out.println("Escolha do PC: " + escolhaRandom);

            } else {
            resultado = "Escolha invalida, faz certo";
        }

        System.out.println(resultado);

    }
}
