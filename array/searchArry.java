package array;

import java.util.Scanner;

class searchArry{
    public static void main(String[] args) {
        int a[]=new int[5];
        int count=0;
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();

        }
            System.out.println("first array element");
             for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
          System.out.print("\nenter searching itme ");
            n=obj.nextInt();
     for(int i=0;i<a.length;i++){
           if(a[i]==n)
           count++;
        }
        if(count>0)
        System.out.println("item found "+ count+" time");
        else
        System.out.println("not found");
       
    }
}
