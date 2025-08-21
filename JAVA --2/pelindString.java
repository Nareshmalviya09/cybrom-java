public class pelindString {
    public static void main(String[] args) {
         String str = "madams";
          
        int start=0;
        int end=str.length()-1;
        boolean palin=true;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                palin= false;
                break;
            }
            start++;
            end--;
        }
        if (palin) {
            System.out.println("palin");
        }
        else System.out.println("not ");
    }
    
}
