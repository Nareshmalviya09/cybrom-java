
import java.util.*;

class maxArry{
    public static void main(String[] args) {
        System.out.println("enter array elements");
        int a[]=new int[5];
        
        Scanner obj = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
            int max=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}