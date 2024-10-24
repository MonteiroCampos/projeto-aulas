import java.text.NumberFormat;
import java.util.Locale;
import java.text.Format;

public class FormatarNumero {
    public static void main(String[]args){
        long numero = 1234567890;
        double numeroDecimal = 12345.67895;
        double porcentagem = 0.15;

        NumberFormat formato = NumberFormat.getInstance(new Locale("pt", "BR"));
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat formatoPorcento = NumberFormat.getPercentInstance();
        formato.setMaximumIntegerDigits(7);
        //formato.setMinimunFractionDigits(7);
        System.out.println("NÚMERO FORMATADO CONFORME CONFIGURAÇÃO DO SISTEMA OPERACIONAL: " + formato.format(numero));
        System.out.println("NÚMERO DE MILHAR COM CASAS DECIMAIS PADRÃO: " + formato.format(numeroDecimal));
        System.out.println("FORMATANDO MOEDA: " + formatoMoeda.format(numeroDecimal));
        System.out.println("FORMATANDO PORCENTO: " + formatoPorcento.format(porcentagem));

    }
}
