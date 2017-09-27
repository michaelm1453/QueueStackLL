import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int num = 1;
   int x = 0; int y = 0; int number = 0;
   Stack<Coordinate> coords = new Stack<>();
	//So you need to make a pair class to hold the x and y values for the coordinates
	//You need to use all if statements, otherwise it'll go on the first one only
	//Call the floodfill recursively to go to the next coordinate
	//Needs a starting number (1), and then after you fill a spot, increase the number

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      while(num <100){
	        if(pixels[row][column] == 0){//for the first point
	    	    coords.push(new Coordinate(row, column, num));  //adds to the stack a coordinate with a value
		        num ++;
		        System.out.println(row+ " " + column+ " " + num);
  			}
		    if(row+1 < 10&& pixels[row+1][column] ==0){//checks south
		    	coords.push(new Coordinate(row+1, column, num));  //adds to the stack  a coordinate with a value
			    num++;
			    System.out.println((row+1) + " " + column +" " + num);
			}

	        if(column +1 < 10 && pixels[row][column+1] == 0){//checks east
	        	coords.push(new Coordinate(row, column+1, num));  //adds to the stack a coordinate with a value
	        	num++;
	        	System.out.println(row + " " + (column+1) +" " +num);
	        }

		    if(row -1 >=0 &&pixels[row-1][column] ==0){//checks west
		    	coords.push(new Coordinate(row-1, column, num));  //adds to the stack a coordinate with a value
		    	num++;
		    	System.out.println((row-1) + " " + column+" " + num);
		    }

		    if(column-1 >= 0&&pixels[row][column-1] ==0){//checks south
		    	coords.push(new Coordinate(row, column-1, num));//adds to the stack a coordinate with a value
		    	num++;
		    	System.out.println(row+ " " + (column-1) +" " + num);
		    }
			while(coords.size() > 0){
				//for(Coordinate c : coords)
					//System.out.println(c);

				Coordinate c = coords.pop();
				x = c.x; y = c.y; number = c.num;
				pixels[x][y] = number;
				floodfill(x,y);//goes back through the stack

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
