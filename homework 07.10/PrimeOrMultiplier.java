import java.util.Scanner;

public class PrimeOrMultiplier {
    static boolean isPrime (int x){
        boolean PrimeBoolean = true;
        for (int i = 2; i<x;i++) {
            if (x % i == 0) {
                PrimeBoolean = false;
            }
        }
        return (PrimeBoolean);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer Number = scanner.nextInt();
        if (isPrime(Number) == true) {
            System.out.println("Prime");
        } else {
            String Multipliers = "";
            for (int i=1;i<Number;i++){
                if (Number % i ==0){
                    String Stroka = Integer.toString(i) + "*";
                    Multipliers = Multipliers + Stroka;
                }
            }
            int Length = Multipliers.length();
            String FinalStr = Multipliers.substring(0,Length-1);
            System.out.println(FinalStr);
        }
    }
}
