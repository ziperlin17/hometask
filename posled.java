import java.util.Scanner;
import java.util.Random;
public class posled {
    public static void main(String[] args) {
        System.out.println("Сгенерировать последовательность? 'Y/N'");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String answer = scanner.nextLine();
        String yes = "Y";

        if (answer.equals(yes)) {
            int chislo = -1;
            int mass[] = new int[100];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = -100;
            }
            int count = 0;
            chislo = random.nextInt(5);
            while (chislo != 0) {
                mass[count] = chislo;
                count += 1;
                chislo = random.nextInt(5);
            }
            int k = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] != -100) {
                    System.out.println(mass[i]);
                    k += 1;
                }
            }
            int vozrast = 0;
            int ubiv = 0;
            int ravn = 0;
            //System.out.println(k + " элементов");
            for (int i = 0; i < k; i++) {
                if (mass[i] < mass[i + 1] && mass[i + 1] != -100) {
                    vozrast += 1;
                }
                if (mass[i] > mass[i + 1] && mass[i + 1] != -100) {
                    ubiv += 1;
                    //System.out.println(" "+mass[i]+">"+mass[i+1]+" ");
                }
                if (mass[i] == mass[i + 1] && mass[i] != -100) {
                    ravn += 1;
                }

            }
            if (ravn != k - 1 && vozrast != k - 1 && ubiv != k - 1 && k != 1 && k!=0) {
                System.out.println("!");
            }
            if (ravn == k - 1 && k != 1) {
                System.out.println("=");
            }
            if (vozrast == k - 1 && k != 1) {
                System.out.println("<");
            }
            if (ubiv == k - 1 && k != 1) {
                System.out.println(">");
            }
            if (k == 1 || k==0) {
                System.out.println("=");
            }

            //System.out.println("---------------------------------");
            //System.out.println(vozrast + "- up");
            //System.out.println(ubiv + "- down");
            //System.out.println(ravn + "- ravn");


        }else{
            System.out.println("Введите элементы (ввод завершается 0)");
            int chislo = -1;
            int mass[] = new int[100];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = -100;
            }
            int count = 0;
            chislo = scanner.nextInt();
            while (chislo!=0){
                mass[count] = chislo;
                count+=1;
                chislo = scanner.nextInt();
            }
            int k = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] != -100){
                    System.out.println(mass[i]);
                    k+=1;
                }
            }
            int vozrast = 0;
            int ubiv = 0;
            int ravn = 0;
            //System.out.println(k+ " элементов");
            for (int i = 0; i < k; i++) {
                if (mass[i]<=mass[i+1] && mass[i+1]!=-100){
                    vozrast+=1;
                }
                if (mass[i]>=mass[i+1] && mass[i+1]!=-100){
                    ubiv+=1;
                    //System.out.println(" "+mass[i]+">"+mass[i+1]+" ");
                }
                if (mass[i]==mass[i+1] && mass[i] != -100){
                    ravn+=1;
                }

            }
            if (ravn!=k-1 && vozrast!=k-1 && ubiv!=k-1 && k!=1 && k!=0) {
                System.out.println("!");
            }
            if (ravn==k-1 && k!=1){
                System.out.println("=");
            }
            if (vozrast==k-1 && k!=1){
                System.out.println("<");
            }
            if (ubiv==k-1 && k!=1){
                System.out.println(">");
            }
            if (k==1 || k==0){
                System.out.println("=");
            }

            //System.out.println("---------------------------------");
            //System.out.println(vozrast+"- up");
            //System.out.println(ubiv+"- down");
            //System.out.println(ravn+"- ravn");
            }


    }
}
