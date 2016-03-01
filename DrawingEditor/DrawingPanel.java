import java.awt.event.*;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private Color color = Color.RED;
    ArrayList<Shape> list = new ArrayList<Shape>();
    Point2D.Double point = new Point2D.Double(200, 200);
    
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(600,600);
    }
    
    public void pickColor()
    {
        JColorChooser chooser = new JColorChooser();
        Color thing = chooser.showDialog(this, "Select a Color", color);
        color = thing;
    }
    
    public void addCircle()
    {
        Circle circle = new Circle(point, 50, getColor());
        list.add(circle);
        repaint();
    }
    
    public void addSquare()
    {
        Square square = new Square(point, 50, getColor());
        list.add(square);
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i =0; i < list.size(); i++)
        {
            list.get(i).draw(g2, true);
        }
    }
    
    public class extender implements MouseListener, MouseMotionListener, KeyListener
    {
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseDragged(MouseEvent e) {}
        public void mouseMoved(MouseEvent e) {}
        public void keyPressed(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
        public void keyTyped(KeyEvent e) {}
    }
}
