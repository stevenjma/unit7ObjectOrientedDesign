import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        super(x, y, width, height);
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
    public int getPerimeter()
    {
        return (2 * this.width) + (2 * this.height);
    }

    public int getArea()
    {
        return this.width * this.height;
    }
}
