import java.util.Scanner;

public class Main {
    public static double a, b, c;

    public static void main(String[] args) {
        lerabc();

        try{
            System.out.println("O valor de Delta é = " + delta());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        raizes(delta());
    }

    public static void lerabc() {
        Scanner le = new Scanner(System.in);
        System.out.println(">>> Equação do 2º Grau <<<\n");

        System.out.print("Informe o valor de a: ");
        a = le.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = le.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = le.nextDouble();
        System.out.println("");
    }

    public static double delta() throws IllegalArgumentException {
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("O valor de Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    }

    public static void raizes(double valordelta) {
        double x1=(-b+Math.sqrt(valordelta))/(2*a);
        double x2=(-b-Math.sqrt(valordelta))/(2*a);
        System.out.printf("O valor de X1 é = %.2f\n", x1);
        System.out.printf("O valor de X2 é = %.2f\n", x2);
    }
}
