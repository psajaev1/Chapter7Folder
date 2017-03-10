

/**
 * Write a description of class Mammal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mammal extends Animal
{
    /** description of instance variable x (add comment for each instance variable) */
    boolean hair;

    /**
     * Default constructor for objects of class Mammal
     */
    public Mammal(boolean hairs)
    {
        // initialise instance variables
        hair = hairs;
        super("mammal");
    }
    
    public string move(){
        
        return "run";
    }
        
   
    public boolean getHair()
    {
        // put your code here
        return hair;
    }

}
