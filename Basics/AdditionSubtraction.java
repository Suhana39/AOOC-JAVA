import java.util.Scanner;

public class AdditionSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);

        sc.close();
    }
}
