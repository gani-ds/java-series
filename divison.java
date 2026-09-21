import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = sc.nextDouble();

        System.out.print("Enter another number: ");
        double b = sc.nextDouble();

        System.out.println("Result = " + (a / b));
    }
}