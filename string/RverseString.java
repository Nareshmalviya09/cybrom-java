package string;
public class RverseString {
    public static void main(String[] args) {
        String r="naresh";
        String r2="";
        int l=r.length();
        for(int i=l-1;i>=0;i--){
            r2=r2+r.charAt(i);
        }
        System.out.println(r2);
    }
}
