import java.util.Scanner;
public class main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        System.out.println("введіть ім'я 1 кролика");
        String rabbit1Name = s.nextLine();
        System.out.println("ім'я кролика 1 "+rabbit1Name);
        System.out.println("введіть ім'я 2 кролика");
        String rabbit2Name = s.nextLine();
        System.out.println("ім'я кролика 2 "+rabbit2Name);
        System.out.println("введіть ім'я 3 кролика");
        String rabbit3Name = s.nextLine();
        System.out.println("ім'я кролика 3 "+rabbit3Name);

        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|");
        System.out.println("------------------------");

        System.out.println("введіть настрій 1 кролика");
        String rabbit1Mood = s.nextLine();
        System.out.println("настрій кролика 1 "+rabbit1Mood);
        System.out.println("введіть настрій 2 кролика");
        String rabbit2Mood = s.nextLine();
        System.out.println("настрій кролика 2 "+rabbit2Mood);
        System.out.println("введіть настрій 3 кролика");
        String rabbit3Mood = s.nextLine();
        System.out.println("настрій кролика 3 "+rabbit3Mood);

        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|");
        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Mood+"\t|\t"+rabbit2Mood+"\t|\t"+rabbit3Mood+"\t|");
        System.out.println("------------------------");

        System.out.println("введіть що сказав 1 кролик");
        String rabbit1Speech = s.nextLine();
        System.out.println("сказав кролик 1 "+rabbit1Speech);
        System.out.println("введіть що сказав 2 кролик");
        String rabbit2Speech = s.nextLine();
        System.out.println("сказав кролик 2 "+rabbit2Speech);
        System.out.println("введіть що сказав 3 кролик");
        String rabbit3Speech = s.nextLine();
        System.out.println("сказав кролик 3 "+rabbit3Speech);

        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Name+"\t|\t"+rabbit2Name+"\t|\t"+rabbit3Name+"\t|");
        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Mood+"\t|\t"+rabbit2Mood+"\t|\t"+rabbit3Mood+"\t|");
        System.out.println("------------------------");
        System.out.println("|\t"+rabbit1Speech+"\t|\t"+rabbit2Speech+"\t|\t"+rabbit3Speech+"\t|");
        System.out.println("------------------------");


    }
}
