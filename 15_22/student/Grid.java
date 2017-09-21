import java.util.LinkedList;
import java.util.Queue;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int num = 1;
	//So you need to make a pair class to hold the x and y values for the coordinates
	//You need to use all if statements, otherwise it'll go on the first one only
	//Call the floodfill recursively to go to the next coordinate
	//Needs a starting number (1), and then after you fill a spot, increase the number

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      while(num <101){
	      if(pixels[row][column] == 0){
		    pixels[row][column] = num;
		    num ++;
  			}
		    if(row+1 < SIZE && pixels[row+1][column] ==0){
			    	num++;
			}

	        if(column +1 < SIZE && pixels[row][column+1] == 0)
			    num++;
		    if(row -1 >=0 &&pixels[row-1][column] ==0)
			    num ++;
		    if(column-1 >= 0&&pixels[row][column-1] ==0)
			    num++;

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
