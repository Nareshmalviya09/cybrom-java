

class a2{
    public static void main(String[] args) {
        int temp=0;
        int a[]={1,2,3,31,76,90};
        for (int i=0;i<a.length/2;i++){
                temp=a[a.length-1-i];
                a[a.length-1-i]=a[i];
                a[i]=temp;
        
       }
       for(int i=0;i<a.length;i++){

        System.out.print(a[i]);

       }
               
    }
}