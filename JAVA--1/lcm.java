public class lcm{

    public static void main(String[] args) {
        
        int n1=7;
        int n2 = 9;

        int lcm=0;
        for (int i=n2; ; i=i+n2){
            if(i%n1==0 && i%n2==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }

}