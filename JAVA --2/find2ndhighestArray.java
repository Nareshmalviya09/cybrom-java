public class find2ndhighestArray {
    
    public static void main(String[] args) {
        int a[]={51,43,65,77,23,4,76};
        System.out.println(secounthighest(a));
    }

    static int secounthighest(int arr[]){
             
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int max2=arr[arr.length-2];
        return max2;
    }
}
