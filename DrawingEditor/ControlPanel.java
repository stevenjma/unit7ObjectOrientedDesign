import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {
        JFrame frame = new JFrame("Drawing Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JButton("Pick Color"));
        frame.add(new JFrame(canvas.getColor()));
        frame.add(new JButton("Add Circle"));
        frame.add(new JButton("Add Square"));
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }
}
