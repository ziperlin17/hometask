
package ClassTest;
public class ClassRoom {

    int number ;
    int amount;
    boolean lesson;

    public ClassRoom(int number, int amount, boolean lesson) {
        this.number = number;
        this.amount = amount;
        this.lesson = lesson;
    }
        void ask() {
        if (lesson == false && amount>20) {
            System.out.print("- А почему так душно?\n" + "- Откроем окно...\n");
            System.out.println("- Можно");
        } else {
            System.out.println("- Уходи");
        }
    }
        int boyNextDoor() {
            System.out.println("-Какой кабинет дальше по коридору?");
            return number+1;
        }
        static void description() {
            System.out.println("| "+"№ Аудитории"+"   "+"Количество человек"+"   "+"Идет занятие?"+" |");
        }
}
