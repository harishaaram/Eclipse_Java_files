/* 
 * To print the name
 * page 104!
 */
import java.io.*;
public class name_pg104
{
	
	static class Name
	{
		String first,last,middle;
		
		public Name() throws IOException
		{
			BufferedReader in1;
			in1 = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter your first name");
			first = in1.readLine();
			System.out.println("Enter your middle name");
			middle = in1.readLine();
			System.out.println("Enter your last name");
			last = in1.readLine();
		}
		
		public String FirstLastFormat()
		{
			return first + " " + last;
		}
		public String LastFirstMiddleFormat()
		{
			return last + ","+first + " ," + middle;
		}
	}
		public static void main(String[] args) throws IOException
		{
			Name testName1;
			testName1 = new Name();
			System.out.println("FIRST-LAST IS "+ testName1.FirstLastFormat());;
			System.out.println("LAST-first IS "+ testName1.LastFirstMiddleFormat());;
			
		}

}
