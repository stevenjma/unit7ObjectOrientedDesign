import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D center;
    private Color color;
    private double width;
    private double height;

    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double width, double height, Color color)
    {
        this.center = center;
        this.width = width;
        this.height = height;
        this.color = color;
        width = 50;
        height = 50;
    }
    
    /**
     * An example of an abstract method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getX()
    {
        return center.getX();
    }
    
    public double getY()
    {
        return center.getY();
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
    public double[] getCenter()
    {
        return new double[] {center.getX(), center.getY()};
    }

    public void move(double x, double y)
    {
        center = new Point2D.Double(x, y);
    }
    
    public void resize(double x, double y)
    {
        width = x;
        height = y;
    }
    
    public abstract boolean isInside(Point2D.Double point);
    
    /*public boolean isOnBorder(Point2D.Double point)
    {
        return true;
    }
    */
    public abstract void draw(Graphics2D g2, boolean filled);
}
