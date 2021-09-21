import java.util.Scanner;

public class dz1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean enter5 = false;
        double enter0 = -1;
        while (enter0!=0){
            enter0 = scanner.nextDouble();
            if (enter0 == 5){
                enter5=true;
            }
        }
        if (enter5 == true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
