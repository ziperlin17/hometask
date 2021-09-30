import java.util.Scanner;

public class Factorial {
    static long factorial(int x) {
        long temp = 1;
        long proizvedenie = 1;
        while (temp != x+1) {
            proizvedenie = proizvedenie * temp;
            temp += 1;
        }

        return proizvedenie;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer chislo = scanner.nextInt();
        System.out.println(factorial(chislo));
    }
}
