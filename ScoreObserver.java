import java.util.*;

public class ScoreObserver {
    public static void main(String[] args) {
        Score1 obj1 = new Score1();
        Score2 obj2 = new Score2();
        HeadQuater obj = new HeadQuater();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score = ");
        String s = sc.nextLine();
        
        obj.register(obj1);
        obj.register(obj2);
        obj.setSomeData(s);
        sc.close();

    }

}