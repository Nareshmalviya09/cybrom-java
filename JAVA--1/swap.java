import java.util.*;
public class swap
{
    public static void main(String[]arg)
    {
        System.out.print("enter any number");
         int a,b; 
          
        Scanner obj = new Scanner(System.in);

        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("After swap value of A & B " +a+" "+b);
         
    //    a = a ^ b;
    //     b = a ^ b;
    //     a = a ^ b;
    int c = a;
    a = b;
    b = temp;    
     System.out.print("After swap value of A & B " +a+" "+b);

    }
}