import java.util.Scanner;

public class Task2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input count of objects, which will be created :");
        Test t = new Test();
        int n = scan.nextInt();
        t.setVarcount(n);
        System.out.println(t.getVarcount());
        for (int i = 1; i < t.getVarcount(); i++)
        new Test();
        System.out.println("Count of created objects : " + Test.count);
    }
}
