import java.io.*;

class Name {
	String first;
	String mid;
	String last;
	
	public Name() throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter the first, mid , last name");
	first = in.readLine();
	mid = in.readLine();
	last = in.readLine();
	}
	
	public Name(String f1, String f2, String f3){
		first = f1;
		mid = f2;
		last = f3;
		
	}
	public String fullname(){
		return first+mid+","+last;
	}
}
