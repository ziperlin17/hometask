import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int Multiply = 2;
        for (int i=1;i<n;i++){
            Multiply = Multiply * 2;
        }
        System.out.println(Multiply);

    }
}
