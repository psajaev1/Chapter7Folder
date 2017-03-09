

/**
 * Write a description of class Reptile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  Reptile extends Animal
{
   private int numberOfLegs;
   
public  Reptile(){
       super("reptile");
     //  type = "reptile";
       numberOfLegs = 0;
       // calls the constructor of Animal
       
    }
    
    public int getLegs(){
        
        return numberOfLegs;
    }
    
public String move(){
    
    return "crawl";
}
    public Reptile(int numberLegs){
        super("reptile");
        numberOfLegs = numberLegs;
    

}

    public Reptile(String type, int n_o_L){
        super("reptile");
        numberOfLegs = n_o_L;
    

}
public String toString(){
    
    return super.toString() + 
    "\nI have "+getLegs()+ "number of Legss";

}
}