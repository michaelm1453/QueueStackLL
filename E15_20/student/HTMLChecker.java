import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
   Write a program that checks whether a sequence of HTML tags
   is properly nested. For each opening tag, such as <p>, there
   must be a closing tag </p>. A tag such as <p> may have other
   tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>

   The inner tags must be closed before the outer ones.
   Your program should process a file containing tags.
   For simplicity, assume that the tags are separated by
   spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
   public static void main(String[] args)
   {
      String filename = "TagSample1.html";
      Stack<String> stacked = new Stack<>();
	  String next = "";
      try (Scanner in = new Scanner(new File(filename)))
      {
         // Your code goes here
         while(in.hasNext()){//This loop goes through and takes out the opening tags (the ones without '/').
         //So, we need to check if the first one removed from the stack (last one added) is the first one encountered by the thing
			 next = in.next();
			 System.out.println(next);
			 if(!(next.contains("/")))
			 	stacked.push(next);
			 else{
			 	if(next == stacked.pop())

			}


			 for(String tag : stacked){
				String sub = tag.substring(tag.indexOf('<')+1, tag.indexOf('>'));
				if(next.contains(sub))
					System.out.println(sub + next);
					//last one into stack, first one to be taken out
					//last tag that was put in, needs to be the first one encountered when tested

			 }

		 }
		 System.out.println(stacked);






      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }

   }
}
