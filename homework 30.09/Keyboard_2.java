import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keyboard_2 {
    public static void main(String[] args) {
        String string1 = "qwertyuiopasdfghjklzxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        if (letter.equals("m")) {
            System.out.println("q");
        } else {
            for (int i = 0; i < string1.length(); i++) {
                String element = Character.toString(string1.charAt(i));
                list.add(i, element);
                if (letter.equals(element)) {
                    System.out.println(string1.charAt(i + 1));
                }

            }
        }
    }
}
