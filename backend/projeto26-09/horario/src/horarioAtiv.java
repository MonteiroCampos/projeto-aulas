import java.util.Scanner;

public class horarioAtiv {
    public static void main (String[]args) {

        int hora;
        System.out.println("qual o horario atual");
        Scanner entrada = new Scanner(System.in);
        hora = entrada.nextInt();


        if (hora >= 0 && hora <= 24) {

            if (hora > 6 && hora <= 12) {

                System.out.println("é manhã");
            } else {

                if (hora > 12 && hora <= 18) {

                    System.out.println("é tarde");
                } else {

                    if (hora > 18 && hora <= 22) {

                        System.out.println("é noite");
                    } else {

                        System.out.println("é madrugada");
                    }
                }
            }
        }
    }
}