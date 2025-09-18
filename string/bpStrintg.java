package string;
public class bpStrintg {
    public static void main(String[] args) {
        String str = "{([])}";
        int start =0;
        int end= str.length();
         int curly=0;
            int squre=0;
            int circle=0;
            
        while(start<end){
           
    char temp=str.charAt(start);
            if(temp=='{') curly++;
            else if(temp=='[') squre++;
            else if(temp=='(') circle++;

            else if(temp=='}') curly--;
            else if(temp==']') squre--;
            else if(temp==')') circle--;
            start++;
        }
        if (curly==0 && squre==0 && circle==0)
        System.out.println("bp");
        else System.out.println("not");
        
    }
    
}
