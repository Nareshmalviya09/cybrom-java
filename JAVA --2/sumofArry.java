
import java.util.Scanner;

class sumofArry{
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();

        }
            System.out.println("first array element");
             for(int i=0;i<a.length;i++){
                sum = sum+a[i];
            System.out.print(a[i]+" ");
            
        }
          System.out.print("\nsum of aary"+sum);

    }
}
