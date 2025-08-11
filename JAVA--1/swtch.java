import java.util.*;
public class swtch{
    public static void main(String[]arg){
        System.out.println("enter any option");
        Scanner obj = new Scanner(System.in);
       int a = obj.nextInt();
        switch(a){
            case 1 -> System.out.println("case1");
            case 2 -> System.out.println("case2");
            case 3 -> System.out.println("case3");
             
             default -> System.out.print(" invlaid");
        }
    }
}