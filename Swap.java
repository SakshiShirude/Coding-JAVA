import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("before swapping the value of a and b are"+" "+a +" "+b);

        // // logic 1 using extra variable
        // int temp=0;
        // temp=a;
        // a=b;
        // b=temp;

        /*logic 2 without another variable using + & - Symbol
        a=a+b;
        b=a-b;
        a=a-b; */

        // // logic 3  without another variable using * & / Symbol
        // // condition is not single value is 0
        // a=a*b;
        // b=a/b;
        // a=a/b; 

        //  logc 4 using bitwise exor(^) operator
        // a=a^b;
        // b=a^b;
        // a=a^b; 
        
        // logic 4
        b= a+b-(a=b);

        System.out.println("after swapping the value of a and b are"+" "+a +" "+b);
    }
}
