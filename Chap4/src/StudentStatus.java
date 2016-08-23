
import java.io.*;
import Student;
import Name;
public class StudentStatus{
	
	public static void main(String[] args) throws IOException {
		Student theStudent;
		Name inputName;
		int s1;
		int s2;
		int s3;
		String message;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the scores 1 2 3 respectively:");
		s1 = Integer.parseInt(in.readLine());
		s2 = Integer.parseInt(in.readLine());
		s3 = Integer.parseInt(in.readLine());
		
		message = inputName.fullname()+ " has a score1: " + s1 + " Score2:" + s2 + "score 3 :" + s3;
		
		if(theStudent.equals1(0))
			message = message + "Got Failed!!!";
		else if(theStudent.equals1(1))
			message = message + "Got Marginally passed!!!";
		else if(theStudent.equals1(2))
			message = message + "Got passed!!!";
		System.out.print(message);
		
	}

}
