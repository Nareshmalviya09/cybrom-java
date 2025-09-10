package array;
class uniqeNumber{
    public static void main(String[] args) {
        int count=0;
        int arr[] = {8, 1, 8, 3, 1, 2, 2, 9, 7, 3, 4, 2};
        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
        for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j] && arr[i]!=-1)
{
                duplicate = true;
                arr[j]=-1;

}    
        }
        if(!duplicate && arr[i]!=-1){
            System.out.print(arr[i]+" ");
        }

              }
        
          
    }
}