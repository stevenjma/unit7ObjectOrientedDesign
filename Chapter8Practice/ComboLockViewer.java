import java.util.Scanner;

/**
 * Write a description of class ComboLockViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLockViewer
{
    public static void main(String [] args)
    {
        ComboLock locker = new ComboLock(3,25,39);
        Scanner s = new Scanner(System.in);
        String a = "";
        while (!a.equals("q")){
            System.out.println("Enter 'l' to turn left, 'r' to turn right, 'reset' to reset the lock, 'open' to try and open the lock, and 'q' to quit.");
            /*if (s.next().equals("l")){
                System.out.println("How many ticks would you like to turn left?");
                locker.turnLeft(s.nextInt());
            }
            else if (s.next().equals("r")){
                System.out.println("How many ticks would you like to turn right?");
                locker.turnRight(s.nextInt());
            }
            else if (s.next().equals("reset")){
                locker.reset();
            }
            else if (s.next().equals("open")){
                if (locker.open()){
                    System.out.println("Congrats! The locker opened!");
                }
            }
            else{
                System.out.println("Error!");
            }*/
            switch(s.next())
            {
                case "l":
                    System.out.println("How many ticks would you like to turn left?");
                    locker.turnLeft(s.nextInt());
                    break;
                case "r":
                    System.out.println("How many ticks would you like to turn right?");
                    locker.turnRight(s.nextInt());
                    break;
                case "reset":
                    locker.reset();
                    break;
                case "open":
                    if(locker.open()){System.out.println("Congrats! The locker opened!");} else {
                        System.out.println("Sorry! Please try again. We have automatically reset the locker for you.");
                        locker.reset();
                    }                
                    break;
                case "q":
                    a = "q";
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Error!");
                    break;
                    
            }
        }
    }
}
