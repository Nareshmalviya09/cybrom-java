 
import java.util.Scanner;

class mirorrMatrix{
    public static void main(String[] args) {
        int a[][]= new int[2][2];
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter elements of array");
        for (int i=0;i<2;i++){
              for (int j=0 ;j<2;j++){
                a[i][j]=obj.nextInt();

            }
        }
        System.out.println("before");
                 for (int i=0;i<2;i++){
           for (int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
 System.out.println("after");
         for (int i=0;i<2;i++){
           for (int j=1;j>=0;j--){
                System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    }
    }