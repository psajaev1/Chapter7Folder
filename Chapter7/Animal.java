

//********************************************************************
//  Animal.java       Author: Kevin/Terrific/Hayes
//
//  Represents an Animal.
//********************************************************************

// never make an object with an abstract class
// it's too generic to make objects out of it
// abstract class is just a class for all other
// classes to use
// snake uses reptile which uses animal
public class Animal
{
   private String type;

	public Animal()
	{//this is called by default
		type = "Default";
		System.out.println("hello from Animal Default"  );
	}
	
	//abstract public String move();
	
   /**-----------------------------------------------------------------
   *  Creates a Animal with the given type.
   */
   public Animal(String animalType)
   {
      type = animalType;
      System.out.println("hello from Animal");
   }

   /**-----------------------------------------------------------------
   *  Returns this Animals type.
   /*/
   public String getType()
   {
      return type;
   }

   /**-----------------------------------------------------------------
   * Returns a string representation of this Animal.
   /*/
   public String toString()
   {
      return "My type is " + type;
   }


}














