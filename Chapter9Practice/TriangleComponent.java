import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;

/**
 * Write a description of class TraingleGUIComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int [] x, y;
    private Line2D.Double line1, line2, line3;
    private Line2D.Double [] point;
    private int count = 0;

    /**
     * Default constructor for objects of class TraingleGUIComponent
     */
    public TriangleComponent()
    {
        x = new int[4];
        y = new int[4];
        point = new Line2D.Double[4];
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if (count == 1){
            g2.draw(this.point[count]);
        }
        else if (count == 0){
        }
        else if (count == 2){
            g2.draw(this.point[count]);
            g2.draw(line1);
        }
        else if (count == 3){
            g2.draw(this.point[count]);
            g2.draw(line2);
            g2.draw(line3);
        }
        else{
        }
    }
    
    public void paint(int x, int y)
    {
        this.x[count] = x;
        this.y[count] = y;
        this.point[count] = new Line2D.Double(this.x[count], this.x[count], this.y[count], this.y[count]);
        if (count == 1)
        {
            repaint();
            count++;
        }
        
        else if (count == 2)
        {
            line1 = new Line2D.Double(this.x[count - 1], this.x[count], this.y[count - 1], this.y[count]);
            repaint();
            count++;
        }
        else if (count == 3)
        {
            line2 = new Line2D.Double(this.x[count - 1], this.x[count], this.y[count - 1], this.y[count]);
            line3 = new Line2D.Double(this.x[0], this.x[count], this.y[0], this.y[count]);
            repaint();
            count++;
        }
        else if (count == 4)
        {
            for (int i = 0; i < this.x.length; i++)
            {
                this.x[i] = 0;
                this.y[i] = 0;
                this.point[i] = new Line2D.Double(0,0,0,0);
            }
            repaint();
            count = 0;
        }
    }
}
