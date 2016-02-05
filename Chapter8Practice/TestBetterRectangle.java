

/**
 * Write a description of class TestBetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBetterRectangle
{
    public static void main ( String [] args)
    {
        BetterRectangle rectangle = new BetterRectangle(0, 0, 10, 10);
        System.out.println("Expected: 40");
        System.out.println("Result: " + rectangle.getPerimeter());
        System.out.println("Expected: 100");
        System.out.println("Result: " + rectangle.getArea());
    }

}
