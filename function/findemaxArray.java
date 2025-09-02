public class findemaxArray {
    public static void main(String[] args) {

        int arr[]={3,5,3,23,5,65,23,87};
        int res = findmax(arr);
        System.out.println(res);

    }
        
    static int findmax(int[] arr){

        int max =arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    
    
}
