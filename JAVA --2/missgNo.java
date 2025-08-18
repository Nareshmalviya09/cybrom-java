class missgNo{
     public static void main(String[]arg){

        int a[]={1,3,5,6,8,10};
        for(int i=0;i<a.length-1;i++){  
            if (a[i+1]-a[i]>1){  
                System.out.println(a[i]+1);
            
            }
        }
     }

}