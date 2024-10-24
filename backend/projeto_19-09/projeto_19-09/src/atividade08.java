import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class atividade08 {
    public static void main(String[]args) {
        double valorOrg;
        double porcentagem;
        double aliquota = 17;
        double valorFinal;
        double resultado;
        double icms;
        double soma;
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(2);
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O VALOR ORIGINAL: ");
        valorOrg = entrada.nextInt();
        System.out.print("DIGITE O DESCONTO: ");
        porcentagem = entrada.nextInt();


        resultado = valorOrg * (porcentagem / 100);
        System.out.println("O TOTAL DO DESCONTO É: " + formato.format(resultado));

        valorFinal = valorOrg - resultado;
        System.out.println("PREÇO COM DESCONTO: " + formato.format(valorFinal));

        icms = valorFinal * (aliquota / 100);
        System.out.println("ICMS: " + formato.format(icms));

       soma = valorFinal + icms;
        System.out.println("PREÇO FINAL: " + formato.format(soma));

    }
}
