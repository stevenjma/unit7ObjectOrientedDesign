

/**
 * Write a description of class BillfoldTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillfoldTester
{
    public static void main (String [] args)
    {
        CallingCard card1 = new CallingCard("Steven", "16584", 8638);
        DriverLicense card2 = new DriverLicense("Tim Ma", 2018);
        Billfold billfold = new Billfold();
        billfold.addCard(card1);
        billfold.addCard(card2);
        System.out.println(billfold.formatCards());
        System.out.println(billfold.getExpiredCardCount());
    }

}
