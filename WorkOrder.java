/**
   This class encapsulates a work order with a priority.
*/
public class WorkOrder implements Comparable
{

   private double priority;
   private String description;

   /**
      Constructs a work order with a given priority and description.
      @param aPriority the priority of this work order
      @param aDescription the description of this work order
   */

   public WorkOrder(int prior, String descript)
   {
	   priority = (double)prior;
	   description = descript;
   }

   public WorkOrder(String input)
   {//Priority should be 1D2W3456789M
	   if(input.charAt(0) == 'd')//redefines either daily, monthly, or weekly as a decimal
	   		priority = 1.5;
	   	else if(input.charAt(0) == 'w')
	   		priority = 2.5;
	   	else if(input.charAt(0) == 'm')
	   		priority = 9.5;
	   	else
	   		priority = (double)Integer.parseInt(input.substring(0,1)); //gets the priority if it isn't d,w, or m
	   	description = input.substring(1, input.length()); //takes the rest of the string as the description
   }

   /**
	Returns a string with the priority and description
	No parameters
	@return A string with the priority and description
   */

   public String toString()
   {
	   String prior = "";
	   if(priority == 1.5) //resets the values back to daily, monthly, or weekly
	   	prior = "D";
	   else if(priority == 2.5)
	   	prior = "W";
	   else if (priority == 9.5)
	   	prior = "M";
	   else
	   	prior = " " +priority;
	   return "Priority: " + prior + " Description: " + description;//formats the output
   }


  /**
    Compares objects by priority
    @param Object other work order
    @return -1,0,1 comparing priority var
   */
   public int compareTo(Object otherObj)
   {
	   WorkOrder other = (WorkOrder) otherObj;
	   if(priority > other.priority)//compares the priority
	   		return 1;
	   else if (priority == other.priority)
	   		return 0;
	   else
	   		return -1;
   }


} //end of work order
