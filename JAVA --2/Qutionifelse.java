
import java.util.Scanner;

public class Qutionifelse{
    // Q1. given no is nagtive or positive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.err.println("enter any number");
      //  int num = sc.nextInt();
    //     if (num>0)
    //      {
    //         System.out.println("number is positive");
    //      }
    //      else if(num<0){
    //         System.err.println("number is nagetive");
    //      }
    //      else  
       //  System.out.println("number is 0");

       //***number is odd or even */
    //  if (num%2==0)
    //      {
    //         System.out.println("number is even");
    //      }
    //      else 
    //      System.err.println("number is odd");

                //   ***check grade of student
        
        System.out.println("enter your eng mark");
        int eng = sc.nextInt();

         System.out.println("enter your com mark");
        int com = sc.nextInt();

        int total=eng+com;

      if (total>80 && total <100)
         {
            System.out.println("A grad");
         }
         else if(total >50 && total<80 ){
            System.out.println("B grad");
         }
         else  
        System.out.println("fail");
     }

    
    
}


