package array;

import java.util.Scanner;

class coppyArry{
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]= new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();

        }
            System.out.println("first array element");
             for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
         System.out.println("\nsecond array element");
           for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");

    }
}
}