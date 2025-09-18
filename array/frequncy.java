package array;
class frequncy{
    public static void main(String[] args) {
       
        int arr[]={8,1,3,1,2,2,9,7,3,4,2};
        for(int i=0;i<arr.length;i++){
           
            int count=1;
        for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j] && arr[i]!=-1)
{
                count++;
                arr[j]=-1;

}    
        }
        if(arr[i]!=-1){
           
          System.out.println(arr[i]+" comes "+ count+" times");
       
        }

              }
        
          
    }
}
