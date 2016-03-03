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
    Color color;
    double radius;
    
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        this.color = color;
        this.radius = radius;
        circle = new Ellipse2D.Double(center.getX(), center.getY(), radius, radius);
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(color);
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
    
    public void move(double x, double y)
    {
        super.move(x,y);
        circle = new Ellipse2D.Double(x, y, radius, radius);
    }
}
