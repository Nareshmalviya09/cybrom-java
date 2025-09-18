public class armstrong {
   public static void main(String[] args) {
     int num = 153;
     int c = num;
     int r = 0;
     int arm =0;

     while(num>0){
        r = num%10;
        arm = arm+(r*r*r);
        num=num/10;
     }
     if(arm == c )
     System.out.println("armstromg`");
      else
    System.out.println("not ");
    
   }
  
}
