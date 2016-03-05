import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    DrawingPanel canvas;
    JPanel panel = new JPanel();

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        ClickListener listener = new ClickListener();
        JButton color = new JButton("Pick Color");
        JButton circle = new JButton("Add Circle");
        JButton square = new JButton("Add Square");
        JButton mode = new JButton("Switch Modes");
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);
        mode.addActionListener(listener);
        add(color);
        add(panel);
        this.canvas = canvas;
        panel.setBackground(this.canvas.getColor());
        add(circle);
        add(square);
        add(mode);
        
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals("Pick Color")){
                canvas.pickColor();
                panel.setBackground(canvas.getColor());
            }
            else if (e.getActionCommand().equals("Add Circle")){
                canvas.addCircle();
            }
            else if (e.getActionCommand().equals("Add Square")){
                canvas.addSquare();
            }
            else if (e.getActionCommand().equals("Switch Modes")){
                canvas.switchModes();
            }
        }
    }
}
