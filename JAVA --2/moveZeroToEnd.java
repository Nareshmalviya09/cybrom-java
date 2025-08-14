class moveZeroToEnd{
    public static void main(String[] args) {
        int count=0;
        int arr[]={0,1,0,2,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
{
               arr[count]=arr[i]; 
               count++;

}        }
        for(int i=count;i<arr.length;i++){
              
            arr[i]=0;
            }
          for(int i=0;i<arr.length;i++){
              
           System.out.print(arr[i]+" "); 
            }
    }
}