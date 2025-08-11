        //Sort() Equels()  coppyOf()
import java.util.*;

class arryMathodsort{
    public static void main(String[] args) {
        System.out.println("enter elements of array");
        int a[] = new int[5];
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=obj.nextInt();
        }
        Arrays.sort(a);
             for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}