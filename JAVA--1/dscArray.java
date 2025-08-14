class dscArray{
    public static void main(String[] args) {
        int arr[]={12,30,87,97,890,825,900};
        int temp=0;
        for(int i=0;i<arr.length;i++){  //0<5
        for(int j=0;j<arr.length-1;j++) // 0<5-1
        {
            if (arr[j]<arr[j+1]){    
                temp=arr[j];         
                arr[j]=arr[j+1];      
                arr[j+1]=temp;       
            }
         }
           }
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
           }
             
    }
}