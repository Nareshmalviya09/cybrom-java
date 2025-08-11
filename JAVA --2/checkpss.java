
import java.util.Scanner;

class checkpss{
    public static void main(String[] args) {
        String orginolpassword="passwor123";
        String userpassword;
        Scanner sc = new Scanner(System.in);
        do{
           System.out.println("Enter your password"); 
           userpassword=sc.nextLine();
           if(orginolpassword.equals(userpassword)){
            System.out.println("welcome");
            break;
           }else{
           System.out.println("wrong password");
           }
        }while (true);     
           
    }
}