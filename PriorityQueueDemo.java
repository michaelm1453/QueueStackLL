import java.util.PriorityQueue;

/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
	  //create PriorityQueue of WorkOrder
	  PriorityQueue<WorkOrder> work = new PriorityQueue<>();

      //add several WorkOrder
      work.add(new WorkOrder(7, "Tile Floor"));
      work.add(new WorkOrder(1, "Get fan"));
      work.add(new WorkOrder(2, "Close the Pool"));
      work.add(new WorkOrder(1, "Fix sewer problems"));
      work.add(new WorkOrder(4, "Buy new thing"));





	  //display WrokOrder and you "finish"/remove from the list
      while (work.size() > 0)
      {
		  System.out.println(work.remove());

      }
   }
}
