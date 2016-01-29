

/**
 * Write a description of class ChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
    /** description of instance variable x (add comment for each instance variable) */
    private int numberOfChoices;

    /**
     * Default constructor for objects of class ChoiceQuestion
     */
    public ChoiceQuestion()
    {
        // initialise instance variables
        super();
        numberOfChoices = 0;
    }

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
    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        this.addText("\n" + numberOfChoices + ") " + choice);
        if (correct)
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer(choiceString);
        }
        
    }

}
