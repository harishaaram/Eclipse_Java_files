//io operation:
import java.io.*;

public class filesys{
	
	public static void main(String[] args) throws IOException {
		
		String lineone = "asdf";
		String line2 = "sdf";
		String line3 = "sdfsdf";
		
		PrintWriter outfile;
		BufferedReader infile;
		
		outfile = new PrintWriter(new FileWriter("outfile.dat"));
		infile = new BufferedReader(new FileReader("infile.dat"));


		lineone = new String(infile.readLine());
		line2 = new String(infile.readLine());
		line3 = new String(infile.readLine());
		
		infile.close();
		
		outfile.println(line3);
		outfile.println(line2);
		outfile.println(lineone);
		outfile.println(line3);
		outfile.close();
		
	}

}
