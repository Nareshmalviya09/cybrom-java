public class upperCaseString {
    public static void main(String[] args) {
        String str ="NARESH";
        int start=0;
        int end=str.length();
        char ch[]=new char[str.length()];
        while (start<end) {
            char c= str.charAt(start);

             if(c>='a' && c<='z'){    
                 c=(char)(c-32);
              }

             else if(c>='A' && c<='Z') {
                c=(char)(c+32);
             }
             
             ch[start]=c;
             start++;
              
        }
        for (char m : ch) {
                    System.out.print(m);
                }
               
    }
    
}
