import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
       
        double x = 10.35784;
      
       System.out.println(x);
       System.out.printf("%.2f%%n", x);
       System.out.printf("%.4f%n", x);
       Locale.setDefault(Locale.US);
       System.out.println("Resultado = " + x + " metros");
       System.out.printf("Resultado = %.2f metros%n", x);

        // %f = ponto flutuante | %d = inteiro | %n = quebra de linha
        // %s = string | %b = booleano | %c = caractere
        String nome = "Maria";
        int idade = 25;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha %.2f reais%n" , nome, idade, renda);


        /*  Resumo da aula 
         *  System.out.print = imprime um texto na tela
         *  System.out.println = imprime um texto na tela e faz uma quebra de linha
         *  System.out.printf = Imprime testos formatados na tela
         * 
         *  %d = inteiro
         *  %f = ponto flutuante
         *  %s = string
         *  %n = quebra de linha
         *  %2f = Numeros com 2 casa decimais 
         *  %4f = Numeros com 4 casa decimais
         *  %.2f = ponto flutuante com 2 casas decimais
         *  %.4f = ponto flutuante com 4 casas decimais
         * 
         * load = Locale.US = Define o padrão de formatação para o padrão americano
         * como conecaternar varios elementos em um mesmos comando ce escrita
         * 
         */

    }
}
