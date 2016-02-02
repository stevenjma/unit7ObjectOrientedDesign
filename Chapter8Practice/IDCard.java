

/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;

    /**
     * Default constructor for objects of class IDCard
     */
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
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
    public String format()
    {
        // put your code here
        return super.format() + "\n" + "ID: " + idNumber;
    }

    public String toString()
    {
        return "IDCard[name="+super.getName()+"][number="+idNumber+"]";
    }
    
    public boolean isEquals(IDCard card)
    {
       if (super.getName().equals(card.getName()) &&
            idNumber == card.idNumber){
           return true;
       }
       else
       {
           return false;
       }
    }
}
