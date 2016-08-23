package introtocs.intermediate;
import java.util.Scanner;
import java.io.*;
public class readingFile {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/Admin/Desktop/IIT/books/CS201/Eclipse_Java_files/IntroToCS/readfiles.txt");
		try{
			
			PrintWriter out = new PrintWriter(file);
			try{
				out.println("The line is 1");
				out.println("The line is 2");
				out.println("The line is 3");
				out.println("The line is 4");
			}finally{
				out.close();
			}

			Scanner in = new Scanner(file);
			try{
				String Contents = in.nextLine();

				while(in.hasNextLine()){
					Contents = in.nextLine();
					Contents = Contents +"$$$$$$$$$$$$$";
				System.out.println(Contents);
				}
			}
			finally {
				in.close();
				}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
