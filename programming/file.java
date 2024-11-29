import java.io.FileWriter;
import java.io.IOException;


public class file {
    public static void main(String[] args){
        
        try {
            FileWriter emri=new FileWriter("username.txt");
            emri.write("Arlinda");
            
            FileWriter password=new FileWriter("Pass.txt");
            password.write("Arlinda1234");
            
            emri.close();
            password.close();
            System.out.println("U shkruajt me sukses ne file");
        }
            catch(IOException e){
                    System.out.println("An error");
                    e.printStackTrace();
                    
        }
    
}
}
