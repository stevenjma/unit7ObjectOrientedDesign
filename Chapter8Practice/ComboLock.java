

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private int position = 0;
    private int [] set = new int[3];
    private int [] numbers = new int[3];
    private String order = "";

    /**
     * Default constructor for objects of class ComboLock
     */
    public ComboLock(int secret1, int secret2, int secret3)
    {
        // initialise instance variables
        numbers[0] = secret1;
        numbers[1] = secret2;
        numbers[2] = secret3;
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
    public void reset()
    {
        // put your code here
        position = 0;
        order = "";
        set[0] = 0;
        set[1] = 0;
        set[2] = 0;
    }
    
    public void turnLeft(int ticks)
    {
        position = position + ticks;
        order += "l";
        set[order.length() - 1] = position;
    }
    
    public void turnRight(int ticks)
    {
        if (position == 0 && (position - ticks) < 0)
        {
            position = 40;
        }
        if (( position - ticks) < 0)
        {
            position = 0 - (position - ticks);
        }
        else
        {
            position = position - ticks;
        }
        order += "r";
        set[order.length() - 1] = position;
    }
    
    public boolean open()
    {
        boolean isCorrect = true;
        if (order.equals("lrl")){
            for (int i = 0; i < set.length; i++)
            {
                if (set[i] != numbers[i])
                {
                    isCorrect = false;
                }
            }
        }
        else
        {
            isCorrect = false;
        }
        return isCorrect;
    }
}
