import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.EmptyStackException;
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
      String next = ""; int works = 0;
      try (Scanner in = new Scanner(new File(filename)))
      {
         // Your code goes here
         while(in.hasNext()){//This loop goes through and takes out the opening tags (the ones without '/').
             next = in.next();
             if(!(next.contains("/")))
                stacked.push(next); //All of the opening tags go here
             else{ //If the next tag DOES have a '/', it goes here
                try{
                	String fromStack = stacked.peek(); //takes the most recent element from the stack
                	String subStack = fromStack.substring(fromStack.indexOf('<')+1, fromStack.indexOf('>')); //gets what's inside the tag
                	if(next.contains(subStack))
                	    stacked.pop(); //if the first closing tag matches the most recent opening tag, remove the opening tag from the stack
					}
				catch(EmptyStackException yikes){
					System.out.println("This is not in HTML style");
					works = 1;
				}

                }
            }

         if(stacked.isEmpty() && works == 0)
            System.out.println("This is in HTML style");
         else if(works ==0)
            System.out.println("This is not in HTML style");
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }

   }
}
