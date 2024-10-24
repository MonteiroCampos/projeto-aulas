import java.util.Locale;
public class aula4 {
    public static void main (String[]args){
        String product1 = "Computador";
        String product2 = "Mesa de Escritório";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s cujo o preço é %.2f%n", product1, price1);
        System.out.printf("%s cujo o preço é %.2f%n", product2, price2);
        System.out.printf("Registro: %d , código %d e gênero %c%n", idade, codigo, genero);
        System.out.printf("Medida com oito casas decimais: %f%n", medida);
        System.out.printf("Roreado (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);







    }

}
