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

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        JPanel panel = new JPanel();
        add(new JButton("Pick Color"));
        add(panel);
        panel.setBackground(canvas.getColor());
        add(new JButton("Add Circle"));
        add(new JButton("Add Square"));
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals("Pick Color")){
                
            }
            else if (e.getActionCommand().equals("Add Circle")){
            }
            else{
            }
        }
    }
}
