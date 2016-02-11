import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;

/**
 * Write a description of class TraingleGUIComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TraingleGUIComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle point;

    /**
     * Default constructor for objects of class TraingleGUIComponent
     */
    public TraingleGUIComponent(int pointx, int pointy)
    {
        point = new Rectangle(1, 1, pointx, pointy);
    }

    
    public void paintDot(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
    
    public void paintLine(Graphics g)
    {
        g.drawLine();
    }
    
    public static void main (String[] args)
    {
        
    }

}
