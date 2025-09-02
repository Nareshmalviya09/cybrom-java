public class var_arg {
    static void add(String... a){
         for (String name : a) {
            System.out.println(name);
        }
       
    }

    public static void main(String[] args) {
        add();
        add("naresh","rohit");
        add("naresh","rohit","virat");
        
        
    }
    
}
