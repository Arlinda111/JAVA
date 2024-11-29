//packpage dominusoft;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Shuma {
    public static void main(String[] args){
     
      /*System.out.println("Vendorni nje numer nga tastiera ");  
     Scanner  input1= new Scanner (System.in);
     int nr= input1.nextInt();*/
       int nr=2;
        float s=0;
       float base=3;
        float nr2=4;
        float nr3=3;
        int exponent=1;
        int power=1;
        
        for(int i=1;i<=nr;i++){
           power=power*exponent;
        
            if(exponent%2!=0)
            {
                s=s+(base*nr2/nr3);
               
                nr2=nr2*2;
                exponent++;
                base=base*3;
            }
            else
            {
            s=s-(base*nr2/nr3);
        }
            System.out.println("Shuma eshte "+s);
    }
}
}
       
