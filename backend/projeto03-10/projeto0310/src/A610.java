import java.util.Scanner;

public class A610 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o estado civil? ");
        String estadoCivil = entrada.nextLine();

        if (estadoCivil.equalsIgnoreCase("casado") || estadoCivil.equalsIgnoreCase("casada")) {
            System.out.println("Você é casado(a).");

        } else if (estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("solteira")) {
            System.out.println("Você é solteiro(a).");

        } else if (estadoCivil.equalsIgnoreCase("viúvo") || estadoCivil.equalsIgnoreCase("viúva") ||  estadoCivil.equalsIgnoreCase("viuvo") || estadoCivil.equalsIgnoreCase("viuva")) {
            System.out.println("Você é viúvo(a).");

        } else {
            System.out.println("Estado civil inválido.");
        }

        entrada.close();
    }
}