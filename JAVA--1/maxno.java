
import java.util.Scanner;

class maxno{

public static void main(String[] args) {
     int a[] = new int [5];
        int temp=0;
System.out.println("enter arrys elements");
 Scanner obj = new Scanner(System.in); 
    for(int i=0;i<a.length;i++){
        a[i]=obj.nextInt();
    }

         System.out.println("elements of arrays");
           for(int i=0;i<a.length;i++){
             for(int j=i+1;j<a.length;j++)
             {
               if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
             }   
        }
         
          System.out.print( "max no "+temp);
        
}
}