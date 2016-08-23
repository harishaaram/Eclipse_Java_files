import java.util.*;
import java.io.*;
public class Arraylist1 {

	public static void main (String[ ] args)
	{
	new Arraylist1().run();
	} // method main
	public void run()
	{
	ArrayList<String> aList = new ArrayList<String>();
	Scanner keyboardScanner = new Scanner (System.in),
	fileScanner;
	String inFilePath,
	word;
	try
	{
	System.out.print ("\n Please enter the path for the input file: ");
	inFilePath = keyboardScanner.nextLine();
	fileScanner = new Scanner (new File (inFilePath));
	while (fileScanner.hasNext())
	{
	word = fileScanner.next();
	System.out.println (word);
	aList.add (word);
	} 
	}// while not end of file
	finally{
		fileScanner.close();
	}
	catch (IOException e){
		e.printStackTrace();
	}
	}
}