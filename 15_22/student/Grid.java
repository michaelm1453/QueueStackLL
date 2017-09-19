import java.util.LinkedList;
import java.util.Queue;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   Queue<Integer> numbers = new LinkedList<>();


   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
	  for(int x = 1; x <= SIZE*SIZE; x ++){
	  	  numbers.add(x);
   	  }
      while(numbers.size() > 0){
		  if(row < SIZE && column < SIZE){
			  pixels[row][column] = numbers.remove();
			  row ++;
			  column ++;

		  }
	  }
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
