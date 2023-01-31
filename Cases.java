import java.util.Scanner;

public class Cases {
    public static void main(String ar[]) {
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("banjiro");
            break;
            default:System.out.println("Invalid choice");
            break;
        }
    }
}
