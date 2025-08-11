
import java.util.Scanner;

class insertarray{
    public static void main(String[] args) {
        System.out.println("enter size of arraay");
        Scanner obj =new Scanner(System.in);
        int size = obj.nextInt();
        System.out.println("enter element");
        int a[] = new int[size+1];
        for(int i=0;i<size;i++){
            a[i]=obj.nextInt();
        }
         System.out.println("enter location");
         int loc = obj.nextInt();
         
           System.out.println("enter item");
         int item = obj.nextInt();
        for(int i=size;i>loc;i--){
            a[i]=a[i-1];
        }
          a[loc]=item;
          size++;
          System.out.print("elements of arrays");
          for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}