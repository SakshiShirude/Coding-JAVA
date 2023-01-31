import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        // logic 1
        // StringBuffer sb= new StringBuffer(String.valueOf(num));
        // StringBuffer rev=sb.reverse();
        // System.out.println("Reverse value is"+ " "+rev);

        //  logic2
        // StringBuilder sb1=new StringBuilder();
        // sb1.append(num);
        // StringBuilder rev1=sb1.reverse();
        // System.out.println("Reverse value is"+ " "+rev1);


        // logic 3 using algorithm
        int rev3=0;
        while (num!=0) {
            rev3=rev3*10 + num%10;
            num=num/10;
        }
        System.out.println("Reverse value is"+ " "+rev3);

    }
    
}
