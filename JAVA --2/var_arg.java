public class var_arg {
    static void add(int ...a){
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        System.out.println("sum of numbers "+sum);
    }

    public static void main(String[] args) {
        add();
        add(10);
        add(12,20);
        add(20,34,25);

    }
    
}
