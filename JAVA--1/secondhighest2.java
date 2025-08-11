class secondhighest2{
    public static void main(String[] args) {
        int arr[]={12,30,87,97,890,825,900};
        int temp=0;
        for(int i=0;i<arr.length;i++){  //0<5
        for(int j=0;j<arr.length-1;j++) // 0<5-1
        {
            if (arr[j]>arr[j+1]){    //12>30
                temp=arr[j];         // 12=12
                arr[j]=arr[j+1];      // 12=30
                arr[j+1]=temp;       //12
            }
         }
           }
           int max2=arr[arr.length-2];
              System.out.println(max2);
    }
}