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

    }
}
