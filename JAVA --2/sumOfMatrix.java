
import java.util.Scanner;

class sumOfMatrix{
    public static void main(String[] args) {
        int a[][]= new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];        
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter elements of array");
        for (int i=0;i<2;i++){
              for (int j=0 ;j<2;j++){
                a[i][j]=obj.nextInt();

            }
        }
            System.out.println("Enter elements of second array");
             for(int i=0;i<2;i++){
              for (int j=0 ;j<2;j++){
                b[i][j]=obj.nextInt();

            }
        }
        System.out.println("sum or two matrix");
         for (int i=0;i<2;i++){
           for (int j=0;j<2;j++){
               c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
    }
    System.out.println();
}  
  }
}