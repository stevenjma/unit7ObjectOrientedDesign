

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        one of the two card slots is null
     * @param    card   The card you're setting card to
     */
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
    }

    public String formatCards()
    {
        if (card1 != null && card2 != null)
        {
            return "["+card1.format()+"|"+card2.format()+"]";
        }
        else if (card1 == null && card2 != null)
        {
            return card2.format();
        }
        else if (card2 == null && card1 != null)
        {
            return card1.format();
        }
        else
        {
            return "all cards are null.";
        }
    }
    
    public int getExpiredCardCount()
    {
        int num = 0;
        if (card1.isExpired())
        {
            num++;
        }
        if (card2.isExpired())
        {
            num++;
        }
        return num;
    }
}
