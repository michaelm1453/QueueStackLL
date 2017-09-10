import java.util.LinkedList;
import java.util.ListIterator;

public class Practuce15_1 {
	
	private static LinkedList<String> names = new LinkedList<String>();
	public static void downsize(LinkedList<String> employeeNames, int n){
		names = employeeNames;
		int count = 0;
		ListIterator<String> iter = names.listIterator();
		while(iter.hasNext()){
			if(count % n == 0){
				iter.next();
				iter.remove();
			}
			else
				iter.next();
			count ++;
		}
		System.out.println(employeeNames);

		
	}
	public static void reverse(LinkedList<String> employeeNames){
		ListIterator<String> iter = employeeNames.listIterator();
		LinkedList<String> reversed = new LinkedList<String>();
		while(iter.hasNext()){
			reversed.addFirst(iter.next());
		}
		System.out.println(reversed);
	}
	public static void main(String[] args){
		LinkedList<String> employeeNames = new LinkedList<String>();
		employeeNames.add("Person A");
		employeeNames.add("Person B");
		employeeNames.add("Person C");
		employeeNames.add("Person D");
		employeeNames.add("Person E");
		employeeNames.add("Person F");
		employeeNames.add("Person G");
		Practuce15_1.reverse(employeeNames);
		Practuce15_1.downsize(employeeNames, 2);
	}

}
