import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);

        Integer Quantity = scanner.nextInt();
        int array[] = new int[10];
        for (int i=0;i<Quantity;i++) {
            array[i] = 0;
        }
        for (int i=0;i<Quantity;i++) {
            Integer Number = scanner.nextInt();
            array[i] = Number;
        }
        int Temp = 1;
        int arrayMax[] = new int[10];
        for (int i=0;i<Quantity;i++) {
            arrayMax[i] = 0;
        }
        for (int i=0; i< array.length-1; i++) {
            if (array[i] == array [i+1]) {
                    Temp +=1;
            } else {
                //System.out.println(Temp+ "!");
                arrayMax[i] = Temp;
                Temp = 1;
            }
        }
        int MaxTemp = 0;
        for (int i=0;i< arrayMax.length; i++) {
            if (arrayMax[i] > MaxTemp) {
                MaxTemp = arrayMax[i];
            }
        }
        System.out.println(MaxTemp);
    }
}
