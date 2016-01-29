import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    // override the setText method to extract the answer from the question text
    /* For example:
     *  "The inventor of Java was _James Gosline_"
     *  
     *      text: "The inventor of Java was _____"
     *      answer: "James Gosling"
     */

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void setText(String questionText)
    {
        // put your code here
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "__________" + parser.next();
        
        super.setText(question);
        this.setAnswer(answer);
    }

}
