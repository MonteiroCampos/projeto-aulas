
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class desconto {
    public static void main(String[]args){
        int valor;
        double porcentagem;
        double resultado;
        double valorFinal;
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(2);
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O VALOR ORIGINAL: ");
        valor = entrada.nextInt();
        System.out.print("DIGITE O DESCONTO: ");
        porcentagem = entrada.nextInt();


        resultado = valor * (porcentagem / 100);
        System.out.println("O TOTAL DO DESCONTO É: " + formato.format(resultado));

        valorFinal = valor - resultado;
        System.out.println("O VALOR A PAGAR É: " + formato.format(valorFinal));



        entrada.close();
    }
}

