package oopps1;
 
class op1{

    public static void name() {
        System.err.println("naresh");
    }
    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        name();
        // int sum=sum(10,20);
        System.err.println(sum(10,50));
    }
}