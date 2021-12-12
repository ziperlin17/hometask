import java.util.Scanner;

public class StringTask {

    public static boolean stringWithVowel (String stringWithVowel) {
        int coincidence = 0;
        String vowel = "eyuioa";
        String Vowel = "EYUIOA";
        int countVowel = 0;
        int countConstant = 0;
        for (int i = 0; i < stringWithVowel.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (stringWithVowel.charAt(i) == vowel.charAt(j)) {
                    coincidence += 1;
                }
            }
        }
        if (coincidence > 0){
            return true;
        } else {
            return false;
        }
    }


    public static boolean vowelMoreInString (String stringLine){
        int countVowel = 0;
        int countConstant = 0;
        if (stringWithVowel(stringLine) == true){
            countVowel +=1;
        } else {
            countConstant +=1;
        }
        if (countVowel>countConstant) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean vowelMore(String[][] matrix, int matrixSize) {
        int falseIndicator = 0;
        for (int i = 0; i < matrixSize; i++) {
            if (vowelMoreInString(matrix[i][i]) == false) {
                falseIndicator +=1;
            }
        }
        if (falseIndicator>0){
            return false;
        }else {
            return true;
        }
    }


    public static int quantityOfIsolatedVowels (String ElemetOfMatrix) {
        int count=0;
        if (stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(0))) && stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(1)))
                && !stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(2)))){
            count+=1;
        }
        if ((stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(ElemetOfMatrix.length() - 1))) && stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(ElemetOfMatrix.length() - 2)))
                && !stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(ElemetOfMatrix.length() - 3))))){
            count+=1;
        }
        for (int i = 3; i < ElemetOfMatrix.length()-3; i++) {
            if (stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(i))) && !stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(i - 1)))
            && stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(i + 1))) && !stringWithVowel(String.valueOf(ElemetOfMatrix.charAt(i + 2)))) {

                count+=1;
            }
        }
        return count;
    }

    public static int quantityOfTrueColumns (String[][] matrix, int matrixSize) {
        int quantityOfTrueColumns = 0;
        int temp = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (quantityOfIsolatedVowels(matrix[j][i]) == 3) {
                    temp+=1;
                }
            }
            if (temp == matrixSize) {
                quantityOfTrueColumns += 1;
            }
            temp=0;
        }
        return quantityOfTrueColumns;
    }

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] StringArray = new String[n][n];
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0 ; j <= n-1; j++) {
                System.out.println("введите элемент "+ "["+i+"]"+ "["+j+"]");
                StringArray[i][j] = scanner.next();
            }
        }
        System.out.println("_________________________");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
//                System.out.print(StringArray[i][j]+"("+vowelMoreInString(StringArray[i][j])+")"+"  ");
                System.out.print(StringArray[i][j] + "  ");
            }
        }
        System.out.println("\n"+"_________________________");
        System.out.println("\n"+"First condition:"+vowelMore(StringArray, n));
        System.out.println("Second condition:"+ (quantityOfTrueColumns(StringArray,n)==2));
        System.out.println("Resoult:" + (vowelMore(StringArray, n) && (quantityOfTrueColumns(StringArray,n)==2) == true));
    }
}
