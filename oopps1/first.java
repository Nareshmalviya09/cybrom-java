package oopps1;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int r = sum(a, b);
        System.out.println(r);
    }
    
   static int sum(int x,int y){
        
        return x+y;
    }
}
