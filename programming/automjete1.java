/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class hera {
    String Tipi="BMW";
    String Ngjyra="E Zeze";
    double Fuqia=2.00;
    int viti=2008;
    
    public void afishotedhena()
    {
        System.out.println("Tipi eshte: "+Tipi);
        System.out.println("Ngjyra eshte: "+Ngjyra);
        System.out.println("Fuqia eshte: "+Fuqia);
        System.out.println("Viti eshte: "+viti);
    }


public int gjejdistance()
{
    
  int shpejtesia=100;
  int koha=2;
  return shpejtesia*koha;
}
}

public class automjete1
{
    public static void main(String[] args)
    {
        automjete1 autoveture=new automjete1();
        autoveture.afishotedhena();
         System.out.println("Distanca eshte: "+autoveture.gjejdistance());
        autoveture.gjejdistance();
       
        
    }
}