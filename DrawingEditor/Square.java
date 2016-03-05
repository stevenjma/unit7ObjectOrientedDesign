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
    private int width;
    private int height;

    public Square(Point2D.Double center, double width, double height, Color color)
    {
        super(center, width, height, color);
        this.width = (int)width;
        this.height = (int)height;
        this.color = color;
        square = new Rectangle((int)center.getX(), (int)center.getY(), this.width, this.height);
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
        return square.contains((int)point.getX(), (int)point.getY());
    }

    public void move(double x, double y)
    {
        super.move(x,y);
        square = new Rectangle((int)x, (int)y, width, height);
    }
    
    public void resize(double x, double y)
    {
        super.resize(x, y);
        square = new Rectangle((int)square.getX(), (int)square.getY(), (int)x, (int)y);
    }
}
