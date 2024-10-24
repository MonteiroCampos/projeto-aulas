import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class operadores {
    public static void main(String[]args){
        int numero1;
        int numero2;
        float resultado;
        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(1);
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.print("DIGITE OUTRO NÚMERO: ");
        numero2 = entrada.nextInt();

        //adição
        resultado = numero1 + numero2;
        System.out.println("SOMA DE " + numero1 + " MAIS " + numero2 + " É IGUAL A " + resultado);

        //subtração
        resultado = numero1 - numero2;
        System.out.println("A SUBTRAÇÃO DE " + numero1 + " MAIS " + numero2 + " È IGUAL A " + formato.format(resultado));

        //multiplicação
        resultado = numero1 * numero2;
        System.out.println("A MULTIPLICAÇÃO DE " + numero1 + " MAIS " + numero2 + " É IGUAL A " + formato.format(resultado));

        //divisão
        resultado = numero1 / numero2;
        System.out.println("A DIVISÃO DE " + numero1 + " MAIS " + numero2 + " É IGUAL A " + formato.format(resultado));

        resultado = numero1 % numero2;
        System.out.println("O RESTO DA DIVISÃO DE " + numero1 + " MAIS " + numero2 + " É IGUAL A " + formato.format(resultado));



        entrada.close();
    }
}
