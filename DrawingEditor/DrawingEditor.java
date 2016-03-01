import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        setLayout(new BorderLayout());
        setSize(600, 600);
        setTitle("Drawing Editor");
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        add(canvas, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }

    public static void main (String [] args)
    {
        DrawingEditor editor = new DrawingEditor();
        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editor.setVisible(true);
    }

}
