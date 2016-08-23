
package fact;
import java.io.*;

public class Factorial1 {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter the No. to Factorial:");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int f = Integer.parseInt(sc.readLine());
		
		factoring new_number = new factoring();
		
		System.out.println("the value" + new_number.factorial(f));

	}

}
