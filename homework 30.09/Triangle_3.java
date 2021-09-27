import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        if ((a + b > c) && (a + c > b) && (c + b > c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
