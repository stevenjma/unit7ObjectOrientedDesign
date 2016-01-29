

/**
 * Write a description of class NumbericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumbericQuestion extends Question
{
    /** description of instance variable x (add comment for each instance variable) */
    private double answer;

    public void setAnswer(double correctResponse)
    {
        // put your code here
        this.answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }

}
