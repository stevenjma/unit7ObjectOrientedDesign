import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.event.MouseListener;

/**
 * Write a description of class TraingleGUIComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int HEIGHT = 1;
    private static final int WIDTH = 1;
    
    private Rectangle point;

    /**
     * Default constructor for objects of class TraingleGUIComponent
     */
    public TriangleComponent()
    {
        point = new Rectangle(HEIGHT, WIDTH, 0, 0);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
    
    public void paintDot(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
    
    public void paintLine(Graphics g, int startpointx, int startpointy, int endpointx, int endpointy)
    {
        g.drawLine(startpointx, startpointy, endpointx, endpointy);
    }
    
    public void setLocation(int x, int y)
    {
        point.setLocation(x, y);
    }
    
    public static void main (String[] args)
    {
        
    }

}
