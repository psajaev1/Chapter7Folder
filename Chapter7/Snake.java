

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Reptile
{
    /** description of instance variable x (add comment for each instance variable) */
    int length;

    /**
     * Default constructor for objects of class Snake
     */
    public Snake(int snakeLength)
    {
        super(0);
         length = snakeLength;
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
    public int getLength()
    {
        return length;
    }
    
    public String move(){
        
        return "slither";
    }
    
    public String toString(){
        
        return super.toString() + " is a snake, " + length+ " inches long";
        
    }
    

}
