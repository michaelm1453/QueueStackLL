import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Write a description of class LinkedList15_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList15_10
{
    public static void main(String[] args){
        LinkedList<String> people = new LinkedList<>();
        ListIterator<String> staff = people.listIterator();
        people.add("Thomas");
        people.add("Ed");
        people.add("Charlie");
        people.add("Andrew");
        people.add("Sue");
        people.add("Si");
        
        staff = people.listIterator();
        
        while(staff.hasNext()){
            if (staff.next().length() <= 3)
                staff.remove();
                
            }
        

    }

}
