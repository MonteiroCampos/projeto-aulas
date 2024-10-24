import java.util.Scanner;

public class CondicionalFaculdade {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite a sua média final: ");
        double media = entrada.nextDouble();
        String mensagem = (media>=7 && idade>=17)
                ? "Aprovado, você pode pertar o vestibular"
                : "Você não atende os requisitos.... :(";
        }

    }
