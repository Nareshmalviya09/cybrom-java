import java.io.File;

public class Fileinfo {
     public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\surbh\\Desktop\\ff.txt");
        if(f.exists()){
        System.out.println("File Name "+f.getName());
        System.out.println("File Location "+f.getAbsolutePath());
        System.out.println("File writable "+f.canWrite());
        System.out.println("File readable "+f.canRead());
        System.out.println("File size "+f.length());
        System.out.println("File remove "+f.delete());
        }
        else {
        System.out.println("No file");
        }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    
}
