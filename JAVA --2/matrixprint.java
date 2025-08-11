
import java.util.Scanner;

class matrixprint{
    public static void main(String[] args) {
        int a[][]= new int[2][2];
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter elements of array");
        for (int i=0;i<2;i++){
              for (int j=0 ;j<2;j++){
                a[i][j]=obj.nextInt();

            }
        }
         for (int i=0;i<2;i++){
           for (int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    }
    }