import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'a'");
        final int a = scan.nextInt();
        System.out.println("Enter 'b'");
        final int b = scan.nextInt();
        System.out.println("Enter 'n'");
        final int n = scan.nextInt();
        System.out.println("Enter 'm'");
        final int m = scan.nextInt();
        float result = 0;
        int c = 1;
        if (a <= c && n >= c) {
            System.out.println("Error");
        } else if (a > n || b > m) {
            System.out.println(result);
        } else {
            for (float i = a; i <= n; i++) {
                for (float j = b; j <= m; j++) {
                    result += (i * j) / (i - c);
                }
            }
            System.out.println(result);
        }
    }
}
