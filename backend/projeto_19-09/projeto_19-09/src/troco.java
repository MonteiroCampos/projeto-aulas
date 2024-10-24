import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class troco {
    public static void main(String[]args){
        float compra;
        double valorPago;
        double trocoResultado;
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(2);
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DA COMPRA: ");
        compra = entrada.nextInt();
        System.out.print("DIGITE O VALOR PAGO: ");
        valorPago = entrada.nextInt();


        trocoResultado = valorPago - compra;
        System.out.println("O VALOR DA COMPRA É: " + formato.format(compra) + ", O VALOR PAGO: " + formato.format(valorPago));
        System.out.println("O TROCO É IGUAL A: " + formato.format(trocoResultado));

        entrada.close();
    }
}
