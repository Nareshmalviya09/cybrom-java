
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
try
{
         FileWriter f = new FileWriter("C:\\Users\\surbh\\desktop\\ff.txt");
            try{
                f.write("java progrmming is the best language");

            }
            finally{
                f.close();
            }
            System.out.println("wrote");
}
   catch(IOException e){
    System.out.println(e);

}

    }

    
}
