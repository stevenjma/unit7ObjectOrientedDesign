import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.Graphics;

public class TraingleGUI implements MouseListener
{
    public void mouseClicked(MouseEvent e)
    {
        Graphics thing;
        TriangleGUIComponent component = new TriangleGUIComponent(e.getX(), e.getY());
        component.paintComponent(thing);
    }
}