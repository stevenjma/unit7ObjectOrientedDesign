import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expirationYear;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, int expirationYear)
    {
        super(n);
        this.expirationYear = expirationYear;
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
        return super.format() + "\n" + "Expiration Year: " + expirationYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (expirationYear < calendar.get(Calendar.YEAR))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "CallingCard[name="+super.getName()+"][expirationyear="+expirationYear+  "]";
    }
    
    public boolean isEquals(DriverLicense card)
    {
       if (this.getClass() == card.getClass())
        {
            DriverLicense otherCard = (DriverLicense)card;
            boolean isEqual = super.equals(otherCard);
            return isEqual && (expirationYear == otherCard.expirationYear);
        }
        
        return false;
    }
}
