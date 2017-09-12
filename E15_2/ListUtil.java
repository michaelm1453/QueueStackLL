import java.util.LinkedList;
import java.util.ListIterator;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   public static void reverse(LinkedList<String> strings)
   {
      	ListIterator<String> iter = strings.listIterator();
	  	LinkedList<String> reversed = new LinkedList<String>();
	  	while(iter.hasNext()){
	  		reversed.addFirst(iter.next());
	  		iter.remove();
	  	}
		for(String string : reversed)
			strings.add(string);
   }
}