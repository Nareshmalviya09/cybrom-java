
import java.util.Scanner;

class delteArry{

public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("enter size or array");
    int size = obj.nextInt();
    int a[] = new int [size];
    System.out.println("enter elements of arrays");
    for(int i=0;i<size;i++){
        a[i]=obj.nextInt();
    }
    int loc;
      System.out.println("enter location of arrays whis you wnat to delete");
        loc=obj.nextInt();

    for(int i=loc;i<size-1;i++){
        a[i]=a[i+1];
    }
    size--;
      System.out.println("elements of arrays");
    for(int i=0;i<size;i++){
        System.out.println(a[i]);
    }
}
}