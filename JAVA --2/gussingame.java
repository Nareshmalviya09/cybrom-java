
import java.util.Random;
import java.util.Scanner;

class gussingame{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random(1);
    int gussno = ran.nextInt(1000) + 1;
    do{

        System.err.println("gusse the number");
        int number = sc.nextInt();
        if (gussno == number) {
            System.err.println("you won..");
        }
        else if(number<gussno){
            System.err.println("too low");
        }
        else if (number > gussno){
            System.err.println("too high");
        }
    }while (true); 
    
    


    }
}