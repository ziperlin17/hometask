import java.util.Scanner;

public class dz2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double enter0 = -1;
        while (enter0 != 0) {
            enter0 = scanner.nextDouble();
            sum+=enter0;
        }
        System.out.println(sum);
    }
}

