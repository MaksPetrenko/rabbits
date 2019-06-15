import java.util.Scanner;
public class main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ім'я кролика 1: ");
        String rabbit1Name = s.nextLine();
        System.out.print("ім'я кролика 2: ");
        String rabbit2Name = s.nextLine();
        System.out.print("ім'я кролика 3: ");
        String rabbit3Name = s.nextLine();

        System.out.println("\nкролики\t|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|\n");

        System.out.print("настрій кролика 1: ");
        String rabbit1Mood = s.nextLine();
        System.out.print("настрій кролика 2: ");
        String rabbit2Mood = s.nextLine();
        System.out.print("настрій кролика 3: ");
        String rabbit3Mood = s.nextLine();

        System.out.println("\nкролики\t|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|");
        System.out.println("настрій\t|\t"+rabbit1Mood+"\t|\t"+rabbit2Mood+"\t|\t"+rabbit3Mood+"\t|\n");

        System.out.print("сказав кролик 1: \"");
        String rabbit1Speech = s.nextLine();
        System.out.print("сказав кролик 2: \"");
        String rabbit2Speech = s.nextLine();
        System.out.print("сказав кролик 3: \"");
        String rabbit3Speech = s.nextLine();

        System.out.println("\nкролики\t|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|");
        System.out.println("настрій\t|\t"+rabbit1Mood+"\t|\t"+rabbit2Mood+"\t|\t"+rabbit3Mood+"\t|");
        System.out.println("слова\t|\t\""+rabbit1Speech+"\"\t|\t\""+rabbit2Speech+"\"\t|\t\""+rabbit3Speech+"\"\t|");
    }
}
