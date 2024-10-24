import java.util.Scanner;

public class GerenciamentoDeAlunos {
    public static void main(String[] args) {
        String aluno1 = "";
        String aluno2 = "";
        String aluno3 = "";
        Scanner entrada = new Scanner(System.in);


        while (true) {
            System.out.println(" \n Menu de alunos:");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.println("Digite a sua opção: ");


            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    if (aluno1.isEmpty()) {
                        System.out.print("Digite o nome do aluno: ");
                        aluno1 = entrada.nextLine();
                        System.out.println("Aluno adicionado");
                    } if (aluno2.isEmpty()) {
                        System.out.print("Digite o nome do aluno: ");
                        aluno2 = entrada.nextLine();
                        System.out.println("Aluno adicionado");
                    } if (aluno3.isEmpty()) {
                        System.out.print("Digite o nome do aluno: ");
                        aluno3 = entrada.nextLine();
                        System.out.println("Aluno adicionado");
                    } {
                        System.out.println("A lista de alunos já está cheia");
                    }
                    break;
            }
        }
    }
}
