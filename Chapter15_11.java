//Michael Mardyla
//Software Engineering
//September 7, 2017
//Priority Queueueueueue Practice

import java.util.Scanner;
import java.util.PriorityQueue;

public class Chapter15_11
{
	public static void main(String[] args)
	{
		PriorityQueue<WorkOrder> order = new PriorityQueue<>();
		Scanner key = new Scanner(System.in);
		String word = " ";
		while(word.equals("quit") != true)
		{
			System.out.println("what you wanna do");
			word = key.nextLine();
			if(word.equals("add")){ //first asks whether you add, remove, or quit
				System.out.println("Put in the task");
				String task = key.nextLine();
				order.add(new WorkOrder(task)); //adds a new workorder using the single argument constructor
			}

			else if(word.equals("next"))
				order.remove();

			else if(word.equals("quit") == false)
				System.out.println("Don't recognize, try again");


		}
		for(WorkOrder description : order)
			System.out.println(description.toString()); //loops through the workorder and displays everything there
	}



}
/**
what you wanna do
add
Put in the task
1 finish this
what you wanna do
add
Put in the task
2 finish that
what you wanna do
add
Put in the task
d finish 15_11
what you wanna do
add
Put in the task
w finish 15_2
what you wanna do
add
Put in the task
3
what you wanna do
next
what you wanna do
next
what you wanna do
quit
Priority:  2.0 Description:  finish that
Priority:  W   Description:  finish 15_2
Priority:  3.0 Description:
Press any key to continue . . .
*/