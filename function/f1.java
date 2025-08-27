package function;

import java.util.Arrays;

public class f1 {
    static int[] printArray(int arr[]){
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={3,5,3,23,5,65,23};
        int res[]=printArray(arr);

        System.out.println(Arrays.toString(res));

    }
    
}
