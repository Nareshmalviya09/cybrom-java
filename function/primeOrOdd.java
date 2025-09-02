class primeOrOdd{
    public static void main(String[] args) {
        prime obj = new prime();
        obj.m1(4);
    }
}
class prime{
    void m1(int num){
        if(num % 2==0)  System.out.println("even");
        else System.out.println("odd");

    }
}