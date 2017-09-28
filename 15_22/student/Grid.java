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
      while(num <101){
	        if(pixels[row][column] == 0){//for the first point
	    	    coords.push(new Coordinate(row, column, num));  //adds to the stack a coordinate with a value
		        
		        pixels[row][column] = num; //Since the point had already been 'filled' it won't be refilled over
		        num ++;
  			}
	        
	        while(coords.size() > 0){

			    if(row+1 < 10 && pixels[row+1][column] ==0){//checks south
			    	coords.push(new Coordinate(row+1, column, num));  //adds to the stack  a coordinate with a value
				    pixels[row+1][column] = num; //Since the point had already been 'filled' it won't be refilled over
				    num ++;
				}
	
		        if(column +1 < 10 && pixels[row][column+1] == 0){//checks east
		        	coords.push(new Coordinate(row, column+1, num));  //adds to the stack a coordinate with a value
		        	pixels[row][column+1] = num; //Since the point had already been 'filled' it won't be refilled over
		        	num ++;
		        }
	
			    if(row -1 >=0 &&pixels[row-1][column] ==0){//checks north
			    	coords.push(new Coordinate(row-1, column, num));  //adds to the stack a coordinate with a value
			    	pixels[row-1][column] = num; //Since the point had already been 'filled' it won't be refilled over
			    	num ++;
			    }
	
			    if(column-1 >= 0&&pixels[row][column-1] ==0){//checks west
			    	coords.push(new Coordinate(row, column-1, num));//adds to the stack a coordinate with a value
			    	pixels[row][column-1] = num; //Since the point had already been 'filled' it won't be refilled over
			    	num ++;
			    }
			    Coordinate c = coords.pop();
			    x = c.x; y = c.y;
			    floodfill(x,y);
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
/**
  21  22  23  25  27  29  31  33  35  37
  19  20  24  26  28  30  32  34  36  38
  17  18  51  50  49  47  45  43  41  39
  16  13  10   7   4  48  46  44  42  40
  14  11   8   5   1   3  52  54  56  58
  15  12   9   6   2  70  53  55  57  59
  79  77  75  73  71  68  66  64  62  60
  80  78  76  74  72  69  67  65  63  61
  81  83  85  87  89  91  93  95  97  99
  82  84  86  88  90  92  94  96  98 100
*/
