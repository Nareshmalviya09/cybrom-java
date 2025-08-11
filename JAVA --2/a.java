
import java.util.Scanner;

class a{
    public static void main(String[] args) {
         Scanner r= new Scanner(System.in);
         System.out.print("enter size of array");
        int s=r.nextInt();
    
        int a[]= new int[s];
       
       
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < s; i++) {
            a[i] = r.nextInt();
        }

        System.out.println("You entered:");
        for (int j = 0; j < s; j++) {
            System.out.print(a[j] + " ");
        }      
    }
}