
import java.util.*;

class arryEquelMethod{
    public static void main(String[] args) {
        System.out.println("enter array elements");
        int a[]=new int[5];
        int a2[]=new int[5];
        Scanner obj = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
         System.out.println("enter second array elements");
        for (int i=0;i<a2.length;i++){
            a2[i]=obj.nextInt();
        }
        boolean b = Arrays.equels(a,a2);
        System.out.print(b);
    }
}