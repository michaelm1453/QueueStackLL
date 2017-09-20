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
	      if(pixels[row][column] == null){
		    pixels[row][column] = numbers.remove();	
	      }
	      else{
		    if(pixels[row+1][column] ==null)
			    row++
	            else if(pxels[row][column+1] ==null)
			    column++;
		    else if(pixels[row-1][column] ==null)
			    row --;
		    else if(pixells[row][column-1] == null)
			    column--;
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
