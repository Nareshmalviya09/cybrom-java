package oopps1;

public class parameterized {
    public static void main(String[] args) {
        P z =new P(25,"naresh");
        z.disp();
    }
}

class P {
    int a; String b;
       P(int x,String y){
            a =x;
            b =y;
    }
    void disp(){
        System.out.println(a+" "+b);;
    }


    
}
