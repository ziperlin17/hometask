package ClassTest;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        System.out.println("Найти кабинет? (Y/N)" );
        Scanner scanner = new Scanner(System.in);
        String Answer = scanner.next();
        String yes = "Y";
        String no = "N";
        if (Answer.equals(yes)) {
            double numberRandom = (int) 101 + Math.random()*1699;
            Integer numberRandomTry = (int)numberRandom;
            double amountRandom = (int) 1 + Math.random()*30;
            Integer amountRandomTry = (int)amountRandom;
            boolean lessonRandom;
            if (amountRandom > 2) {
                lessonRandom = true;
            } else {
                lessonRandom = false;
            }
            ClassRoom classRandom = new ClassRoom(numberRandomTry, amountRandomTry, lessonRandom);
            System.out.println("-----------------------------");
            System.out.println("Аудитория №"+classRandom.number);
            System.out.println("Там "+classRandom.amount+" человек");
            if (classRandom.lesson == true) {
                System.out.println("Идет занятие");
            } else {
                System.out.println("Занятия сейчас нет");
            }
            System.out.println("-----------------------------");
            System.out.println("\n"+"-Зайду в кабинет");
            classRandom.ask();
            System.out.println("-"+classRandom.boyNextDoor());
        } else {
            ClassRoom definiteClass = new ClassRoom(1309,27,true);
            OurClassRoom OurClass = new OurClassRoom(true);
            ClassRoom.description();
            System.out.println("| "+definiteClass.number+"          "+definiteClass.amount+"                   "+ definiteClass.lesson+"          |");
            System.out.println("Зайду в кабинет");
            definiteClass.ask();
            System.out.println("-"+definiteClass.boyNextDoor());
            System.out.println("");
            System.out.println("-Какое у вас расписание?");
            OurClass.classSchedule();
            System.out.println("-Список студентов?");
            OurClass.studentsData();
        }
    }
}
