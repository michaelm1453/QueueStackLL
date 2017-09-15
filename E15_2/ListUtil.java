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
	  		reversed.addFirst(iter.next());//adds the first the input list to the front of the
	  		//second list
	  		iter.remove();
	  	}
		for(String string : reversed)
			strings.add(string);
   }
}

//apparently a removeFirst() method exists. Possibly useful for future uses?
//Tom's way: use a loop, start at the end. Add the first element to counter-1
//recursive way
//*cry a lot*
//String s = strings.removeFirst();
//reverse(strings);
//strings.addLast(s);