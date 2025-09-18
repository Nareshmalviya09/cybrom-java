package string;
public class subsquenceString {
    public static void main(String[] args) {
        String str="abcd";
        String str2="akc";
        
        int j=0;

        for (int i = 0; i < str.length() && j < str2.length(); i++) {
            if (str.charAt(i) == str2.charAt(j)) {
                j++; // move pointer in str2 if characters match
            }
        }

        if (j==str2.length()) {
            System.out.println("sbsequence");
            
        }
        else System.out.println("not");

    }
    
}
