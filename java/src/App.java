import java.util.Locale;

public class App {
    public static void main(String[] args){

        // double x = 10.35784;
        // System.out.printf("%.2f%n", x);
        
        // System.out.printf("%.4f%n", x);
        // System.out.println("Resultado = " + x + " METROS");
        // System.out.printf("Resultado = %.2f Metros%n", x);

        // String nome = "Maria";
        // int idade  = 31;
        // double renda = 4000.0;
        // System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n %nMeasure with eigth decimal places: %.8f %nRouded (three decimal places): %.3f", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%nUs decimal point: %.3f",measure);
    }
}
