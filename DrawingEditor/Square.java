import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    Rectangle square;
    Color color;
    int radius;

    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        this.color = color;
        this.radius = (int)radius;
        square = new Rectangle((int)center.getX(), (int)center.getY(), this.radius, this.radius);
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(color);
        g2.draw(square);
        if (filled)
        {
            g2.fill(square);
        }
    }

    public boolean isInside(Point2D.Double point)
    {
        return true;
    }

    public void move(double x, double y)
    {
        super.move(x,y);
        square = new Rectangle((int)x, (int)y, radius, radius);
    }
}
