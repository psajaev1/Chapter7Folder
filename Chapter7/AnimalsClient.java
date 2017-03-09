

/**
 * Write a description of class AnimalsClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalsClient
{
    public static void main (String [] args){
        
      //  Animal bob = new Animal("Mammal");
       // System.out.println(bob);
        
        Reptile sue = new Reptile();
        System.out.println(sue.getType());
        System.out.println(sue);
        
        Snake Brian = new Snake(10);
        System.out.println(Brian.getType());
        System.out.println(Brian.getLegs());
        System.out.println(Brian);
        
        System.out.println(sue.move());
        System.out.println(Brian.move());
        
        
        
        
    }
    

}
