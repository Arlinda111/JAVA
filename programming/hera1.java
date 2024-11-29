class mjete{
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
class katrori{
    public int gjejsiperfaqen(){
    int gjatesia=10;
   
    return gjatesia*gjatesia; 
}
}  
/*class kuboidi extends katrori{
    public int gjejsiperfaqen(){
       
        //int gjatesia=10;
        int gjeresi=5;
        int lartesi=4;
        //return gjatesia*gjeresi*lartesi;
        
    }*/
    





public class hera1 {
      public static void main(String[] args)
    {
        mjete autoveture=new mjete();
        autoveture.afishotedhena();
         katrori auto=new katrori();
        
       
        
         System.out.println("Distanca eshte: "+autoveture.gjejdistance());
        autoveture.gjejdistance();
       
System.out.println("Siperfaqja eshte: "+auto.gjejsiperfaqen());
        auto.gjejsiperfaqen()  ;  
       
    }
}

    
/*ndertoni nje klase login ku te kete dy atribute konstante username dhe pasword
do shfaqet teksti ju po logoheni me sukses ne momentin kur ne therritje te metodes 
logohu username dhe paswordi i b=vendsur 
nga perdoruersi do jete i = me username dhe pasword konstant
*/
