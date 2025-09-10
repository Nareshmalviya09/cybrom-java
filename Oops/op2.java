package Oops;
class op2{

    static boolean ifeven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.err.println(ifeven(2));
    }
}