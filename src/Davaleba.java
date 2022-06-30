import java.util.Scanner;

public class Davaleba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("გთხოვთ შეიყვანოთ ციფრი: ");
        int a = scanner.nextInt();
        System.out.print("გთხოვთ შეიყვანოთ მომდევნო ციფრი:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("ჯამი: " + sum);

    }
}