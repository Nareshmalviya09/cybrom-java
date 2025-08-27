package function;

public class isPelindromString {
    
            public static void main(String[] args) {
                String s="naman";
                System.out.println(isPelindrom(s));
            }


    static boolean isPelindrom(String str){

        int start =0;
        int end = str.length()-1;
        while (start <end) {
            if (str.charAt(start)!=str.charAt(end)) 
                return false;
                start++;
                end--;   
        }
        return true;
    }

}
