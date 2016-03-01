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

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        JPanel panel = new JPanel();
        ClickListener listener = new ClickListener();
        JButton color = new JButton("Pick color");
        JButton circle = new JButton("Add Circle");
        JButton square = new JButton("Add Square");
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);
        add(color);
        add(panel);
        this.canvas = canvas;
        panel.setBackground(this.canvas.getColor());
        add(circle);
        add(square);
        
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals("Pick Color")){
                canvas.pickColor();
                canvas.getColor();
            }
            else if (e.getActionCommand().equals("Add Circle")){
                canvas.addCircle();
            }
            else{
                canvas.addSquare();
            }
        }
    }
}
