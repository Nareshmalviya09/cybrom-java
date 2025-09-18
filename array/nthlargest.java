package array;
class nthlargest{
    public static void main(String[] args) {
        int arr[]={12,30,87,97,890,825,900};
        int temp=0;
        int n=3;
        for(int i=0;i<n;i++){  //0<5
        for(int j=i+1;j<arr.length;++j) // 0<5-1
        {
            if (arr[i]<arr[j]){    
                temp=arr[i];         
                arr[i]=arr[j];      
                arr[j]=temp;       
            }
         }
           }          
            System.out.print(arr[n-1]);
            
             
    }
}