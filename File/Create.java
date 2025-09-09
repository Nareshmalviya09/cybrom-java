import java.io.File;

public class Create {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\surbh\\Desktop\\ff.txt");
        if(f.createNewFile()){
        System.out.println("creted succesfully...!");
        }
        else {
        System.out.println("alredy exist");
        }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
