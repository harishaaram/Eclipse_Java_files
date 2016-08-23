import java.io.*;
public class chap3_parse {
	public static void main(String[] args) throws IOException
	{
		double n;
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		n = Double.parseDouble(in.readLine());
		n = n-1.0;
		System.out.println("The double value of the string is "+ n);
	}
}
