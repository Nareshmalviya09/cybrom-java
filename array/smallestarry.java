package array;

import java.util.*;

class smallestarry{
    public static void main(String[] args) {
        System.out.println("enter array elements");
        int a[]=new int[5];
        
        Scanner obj = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
            int min=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);

    }
}