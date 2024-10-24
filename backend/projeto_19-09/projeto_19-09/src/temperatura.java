import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class temperatura {
    public static void main(String[]args){
        int celsius;
        float fahrenheit;
        NumberFormat formato = NumberFormat.getInstance(Locale.US);
        formato.setMinimumFractionDigits(1);
        Scanner entrada = new Scanner(System.in);


        System.out.print("INSIRA A SUA TEMPERATURA CELSIUS: ");
        celsius = entrada.nextInt();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A CONVERSÃO DE CELSIUS PARA FAHRENHEIT É " + fahrenheit + " F°");

    }
}