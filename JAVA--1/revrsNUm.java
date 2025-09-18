
class revrsNUm {
    public static void main(String[] args) {
        int number = 512;
        int rev = 0;
        int c = number;
        while(number!=0){
            int r = number%10;
            rev= rev*10+r;
            number=number/10;
        }
            System.out.println(rev);
    
}
 }