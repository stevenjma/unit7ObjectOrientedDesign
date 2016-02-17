import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.awt.event.MouseListener;

public class TriangleFrame extends JFrame
{
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;
    private TriangleComponent component;
    
    class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            component = new TriangleComponent();
            component.paint(e.getX(),e.getY());
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