import java.util.*;
import java.io.*;
public class linearsearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		System.out.println("How many?");
		int n = in.nextInt();
		int array[] = new int[n];//intialisationsd dslfjkfjsldjfsdjkfjdlsjfldskfjslfjksjlkdjflkdsjf7

		System.out.println("Start Entering:");
		for(int i=0; i < n; i++){
			array[i] = in.nextInt();
		}

		System.out.println("Find what?");
		int search = in.nextInt();
		for(int i=0; i < n; i++){
		if(search == array[i])
			System.out.println("Found!");
		}
			System.out.println("NOOOO");
		

	}

}
