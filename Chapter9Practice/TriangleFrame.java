import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TriangleFrame extends JFrame
{
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;
    private TriangleComponent component;
    
    class MousePressListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            component = new TriangleComponent(e.getX(), e.getY());
            component.drawPoint();
        }        
        public void mouseExited(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
    }
    
    public TriangleFrame()
    {
        component = new TriangleComponent();
        add(component);
        
        MouseListener listener = new MouseClickListener();
        component.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}