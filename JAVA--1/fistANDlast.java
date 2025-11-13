
public class  fistANDlast {
    public static void main(String[] args) {
         int num= 155;
        //  System.out.println("heello");
        
         int last = num %10;
         int first=num;
         while(first>=10){
        first = first / 10;
         }
         int sum =first+last;
         System.out.println(sum);

   }
}
  
 