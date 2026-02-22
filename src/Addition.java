import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("digite o segundo número: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.printf("a soma dos números é: %d\n", sum);
        input.close();
    }
}
