import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        int Indicator = 0;
        Scanner scanner = new Scanner(System.in);
        Integer Quantity = scanner.nextInt();
        for (int i=0;i<Quantity;i++) {
            Integer Number = scanner.nextInt();
            while (Number>0){
                int LastDigit = Number % 10;
                Number = Number / 10;
                if (LastDigit == 5 || LastDigit == 3){
                    Indicator+=1;
                    break;
                }
            }
        }
        if (Indicator == Quantity) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
