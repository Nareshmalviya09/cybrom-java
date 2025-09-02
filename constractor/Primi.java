public class Primi {
     
    int a;
    String name[];

    Primi(int a, String name[]) {
          this.a=a;
          this.name=new String[name.length];
          this.name[0]=name[0];
        }
        Primi(Primi obj) {
            this.a=obj.a;
         this.name=new String[obj.name.length];
          this.name[0]=obj.name[0];
    }

    void disp(){
        System.out.println(a+" "+name[0]);
    }

    public static void main(String[] args) {
        String arr[]={"narsh"};
        Primi obj1 = new Primi(11,arr); 
        Primi obj2 = new Primi(obj1); 
         obj1.disp();
        obj1.a=145;
        obj1.name[0]="divyanshi";
       
        obj2.disp();


    }

}

