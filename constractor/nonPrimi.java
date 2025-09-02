public class nonPrimi {
    int a;
    String name[];

    nonPrimi(int a, String name[]) {
        this.a=a;
        this.name = new String[name.length];
           this.name[0]=name[0];         

    }
    nonPrimi(nonPrimi obj) {
        this.a=obj.a;
         this.name = new String[obj.name.length];
           this.name[0]=obj.name[0];         
    }

    public static void main(String[] args) {
        String arr[]={"divya"};
        nonPrimi obj1 = new nonPrimi(11,arr);
        nonPrimi obj2 = new nonPrimi(obj1);
         System.out.println(obj1.a+" "+obj1.name[0]);
        obj1.a=145;
        obj2.name[0]="naresh";
        System.out.println(obj1.a+" "+obj1.name[0]);
        System.out.println(obj2.a+" "+obj2.name[0]);
    }

    
    
}
