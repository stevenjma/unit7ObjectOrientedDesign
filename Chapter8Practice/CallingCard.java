

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card  
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cardNumber;
    private int PIN;

    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard(String n, String id, int PIN)
    {
        super(n);
        cardNumber = Integer.parseInt(id);
        this.PIN = PIN; 
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
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

}
