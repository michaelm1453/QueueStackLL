import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {
	   //create Map: favoriteColors
	   Map<String, Color> favoriteColors = new HashMap<>();
	   favoriteColors.put("Juliet", Color.BLUE);
	   favoriteColors.put("Romeo", Color.GREEN);
	   favoriteColors.put("Adam", Color.RED);
	   favoriteColors.put("Eve", Color.BLUE); //if there are two keys, the second will replace the first
	   favoriteColors.remove("Romeo");
	  //create Set<String> keySet
	  Set<String> keySet = favoriteColors.keySet();
	  // Print all keys and values in the map
	  for(String key: keySet)
	  {
		  Color value = favoriteColors.get(key);
		  System.out.println(key + " : " + value);
	  }
	  for(String key: keySet)
	  {
		  if(
	  }


   }
}
