// Este programa calcula as raízes de uma equação do segundo grau usando a fórmula de Bhaskara dada por ax²+bx+c=0. 
import java.util.Scanner;
import java.lang.Math; 

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

      
        double delta = Math.pow(b, 2) - (4 * a * c); //representação de Δ = b²-4ac  

        if (delta < 0) {
            System.out.println("Delta negativo (" + delta + "). Não há raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        input.close();
    }
}