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
    private Color color;
    ArrayList<Shape> list;
    Point2D.Double point;
    private boolean isPressed;
    private boolean isNotClicked;
    private boolean isDragMode;
    
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        addMouseListener(new extender());
        addMouseMotionListener(new extender());
        color = Color.RED;
        list = new ArrayList<Shape>();
        point = new Point2D.Double(200, 200);
        isPressed = false;;
        isNotClicked = true;
        isDragMode = true;
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
        Circle circle = new Circle(point, 50, 50, getColor());
        list.add(circle);
        repaint();
    }
    
    public void addSquare()
    {
        Square square = new Square(point, 50, 50, getColor());
        list.add(square);
        repaint();
    }
    
    public void switchModes()
    {
        if (isDragMode)
        {
            isDragMode = false;
        }
        else
        {
            isDragMode = true;
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < list.size(); i++)
        {
            if (i == list.size() - 1)
            {
                list.get(i).draw(g2, isNotClicked);
            }
            else
            {
                list.get(i).draw(g2, true);
            }
        }
    }
    
    public class extender implements MouseListener, MouseMotionListener, KeyListener
    {
        private int clickerCount = 0;
        public void mouseClicked(MouseEvent e) {
            if (list.get(list.size() - 1).isInside(new Point2D.Double(e.getX(),e.getY()))){
                isPressed = true;
                if (clickerCount == 0)
                {
                    isNotClicked = false;
                    clickerCount++;
                }
                else
                {
                    isNotClicked = true;
                    clickerCount = 0;
                }
            }
            else
            {
                isNotClicked = true;
            }
            repaint();
        }
        public void mousePressed(MouseEvent e) {
            isPressed = true;
        }
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {
            isPressed = false;
        }
        public void mouseDragged(MouseEvent e) {
            if (isPressed && isDragMode){
                list.get(list.size() - 1).move(e.getX(), e.getY());
            }
            else if (isPressed && !isDragMode){
                list.get(list.size() - 1).resize(e.getX(),e.getY());
            }
            repaint();
        }
        public void mouseMoved(MouseEvent e) {}
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == e.VK_LEFT){
                if (isDragMode){
                    list.get(list.size() - 1).move(list.get(list.size() - 1).getX() - 1, list.get(list.size() - 1).getY());
                }
                else{
                    list.get(list.size() - 1).resize(list.get(list.size() - 1).getWidth() - 1, list.get(list.size() - 1).getHeight());
                }
            }
            else if (e.getKeyCode() == e.VK_RIGHT){
                if (isDragMode){
                    list.get(list.size() - 1).move(list.get(list.size() - 1).getX() + 1, list.get(list.size() - 1).getY());
                }
                else{
                    list.get(list.size() - 1).resize(list.get(list.size() - 1).getWidth() + 1, list.get(list.size() - 1).getHeight());
                }
            }
            else if (e.getKeyCode() == e.VK_UP){
                if (isDragMode){
                    list.get(list.size() - 1).move(list.get(list.size() - 1).getX(), list.get(list.size() - 1).getY() + 1);
                }
                else{
                    list.get(list.size() - 1).resize(list.get(list.size() - 1).getWidth(), list.get(list.size() - 1).getHeight() + 1);
                }
            }
            else if (e.getKeyCode() == e.VK_DOWN){
                if (isPressed && isDragMode){
                    list.get(list.size() - 1).move(list.get(list.size() - 1).getX(), list.get(list.size() - 1).getY() - 1);
                }
                else if (isPressed && !isDragMode){
                    list.get(list.size() - 1).resize(list.get(list.size() - 1).getWidth(), list.get(list.size() - 1).getHeight() - 1);
                }
            }
            else{}
        }
        public void keyReleased(KeyEvent e) {}
        public void keyTyped(KeyEvent e) {}
    }
}
