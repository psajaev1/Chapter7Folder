

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends Snake
{
    /** description of instance variable x (add comment for each instance variable) */
    private boolean poison;
    int length;
    /**
     * Default constructor for objects of class Cobra
     */
    public Cobra(int newlength, boolean newpoison)
    {
            super(0);
            length = newlength;
            poison = newpoison;
      
    }
    
    public String move(){
        
        return "slither";
    }
    
     public String toString(){
        
        return super.toString() + " is a cobra, " + length+ " inches long";
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public boolean getPoison()
    {
        // put your code here
        return poison;
    }

}
