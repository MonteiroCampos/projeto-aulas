import  java.util.Locale;
public class fotmatacao {
    public static void main (String[]args){
        String nome = "Ares";
        int idade = 17;
        double salario = 16000;

        System.out.println(nome + " tem " + idade + " anos e ganha R$" + salario + " reais.");
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, salario);
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, salario);
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, salario);
    }
}