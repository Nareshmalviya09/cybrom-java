
import java.util.Scanner;

class reservArry{
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner obj= new Scanner(System.in);
        System.out.println("enter elements of array");
        for(int i =0;i<5;i++){
            a[i]=obj.nextInt();
        }
         for(int i =4;i>=0;i--){
           System.out.print(a[i]+" ");
        }
    }
}