import javax.swing.JFrame;

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
        setTitle("Drawing Editor");
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new Controls(canvas);
    }

    public static void main (String [] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }

}
