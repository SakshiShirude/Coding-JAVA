
import java.util.*;

public class Ifelse {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("a is greater");
        else if(a<b)
            System.out.println("b is greater");
        else {
            System.out.println("Equal");

        }

    }

}
