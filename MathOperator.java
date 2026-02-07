import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("ผลบวก = " + (a+b));
        System.out.println("ผลลบ = " + (a-b));
        System.out.println("ผลคูณ = " + (a*b));
        System.out.println("ผลหาร = " + (a/b));
        System.out.println("เศษ = " + (a%b));
    }
}