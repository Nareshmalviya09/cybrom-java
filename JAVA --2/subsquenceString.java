public class subsquenceString {
    public static void main(String[] args) {
        String str="abcd";
        String str2="adc";
        int i=0;
        int j=0;

        while (i<str.length() && j<str2.length()) {
            if(str.charAt(i) == str2.charAt(j)){
                j++;
            }
         i++;   
        }
        if (j==str2.length()) {
            System.out.println("sbsequence");
            
        }
        else System.out.println("not");

    }
    
}
