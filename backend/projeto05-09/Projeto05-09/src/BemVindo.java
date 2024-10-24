import java.util.Scanner;

public class BemVindo {
    public static void main(String[] args){
        Scanner entradaDados =new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entradaDados.nextLine();
        System.out.println("ola, " + nome + ". ;");
            System.out.println("Seja bem vindo/a");
    entradaDados.close();
    }
}
