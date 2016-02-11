import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;

    /**
     * Default constructor for objects of class Person
     */
    public Person(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    public int compareTo(Person otherName)
    {
        return this.getName().compareTo(otherName.getName());
    }
    
    public String getName() 
    {
      return name;
    }
    
    public static void main (String [] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ten names.");
        for (int i = 00; i < 10; i++)
        {
            list.add(new Person(s.next()));
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(0).getName() + " " + list.get(9).getName());
    }

}
