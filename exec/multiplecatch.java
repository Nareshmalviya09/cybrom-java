public class multiplecatch {
    public static void main(String[] args) {
        try {
             int a=10,b=2,c;
             c=a/b;
             System.out.println(c);

             int arr[]={10,20,30,40};
             System.out.println(arr[2]);

             String str = "naresh";
             System.out.println(str.toUpperCase());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
