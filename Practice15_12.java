import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;

import javax.swing.JFileChooser;
import java.util.Scanner;

public class Practice15_12 {
	public static void main(String[] args) throws FileNotFoundException{
		JFileChooser picker =  new JFileChooser();
		Scanner file = null;
		TreeSet<String> words = new TreeSet<String>();
		if(picker.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File textFile = picker.getSelectedFile();
			file = new Scanner(textFile);
		}
		while(file.hasNext()){
			words.add(file.next());
		}
		
		int count = 1;
		for(String word:words){
			count ++;
			System.out.println(word);
		}
		System.out.println(count);
		
	}

}
