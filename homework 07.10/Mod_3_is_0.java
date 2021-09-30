import java.util.Scanner;

public class Mod_3_is_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer FirstNumber = scanner.nextInt();
        Integer SecondNumber = scanner.nextInt();
        for (int i = FirstNumber; i <= SecondNumber; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
