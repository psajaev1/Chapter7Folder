

/**
 * Write a description of class Reptile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reptile extends Animal
{
   private int numberOfLegs;
   
   public  Reptile(){
       super("reptile");
       type = "reptile";S
       numberOfLegs = 0;
       // calls the constructor of Animal
       
    }
    
    public Reptile(int numberLegs){
        super("reptile");
        numberOfLegs = numberlegs;
    

}
