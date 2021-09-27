import java.util.Scanner;

public class Prime_1 {
    static boolean isPrime(int c) {
        boolean primeBoolean = true;
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                primeBoolean = false;
                break;
            }
        }
        return primeBoolean;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int QWE = scanner.nextInt();
        if (isPrime(QWE) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
