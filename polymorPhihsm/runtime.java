package polymorPhihsm;

public class runtime {
    public static void main(String[] args) {
        animal obj =new dog();
        obj.sound();
    }
}

class animal {
    void sound(){
        System.out.println("animal sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog sound");
    }
}