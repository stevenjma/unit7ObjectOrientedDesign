import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    Ellipse2D.Double circle;
    
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        circle = new Ellipse2D.Double(50, 50, center.getX(), center.getY());
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        g2.draw(circle);
        if (filled)
        {
            g2.fill(circle);
        }
    }

    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
}
