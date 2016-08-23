import java.util.*;
import java.io.*;

public class company {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new company().run();
	}
	
	public void run() throws FileNotFoundException{
		final String INPUT_PROMPT = "Please Enter the path of the filename";
		final String msg = "\n\n Best Employee is ";
		final String OUTPUT_EMPTY = "\n\n eEmpty file ";
		
		
		String filename;
		System.out.println(INPUT_PROMPT);
		
		filename = new Scanner(System.in).nextLine();
		Scanner sc = new Scanner(new File(filename));
		
		FullTimeEmployee bestpaid = findBestPaid(sc);
		if(bestpaid ==null)
			System.out.println(OUTPUT_EMPTY);
		else
			System.out.println(msg+bestpaid.Getgrosspay());
	}
	public FullTimeEmployee findBestPaid(Scanner sc){
		FullTimeEmployee full, bestpaid = new FullTimeEmployee();
		while(sc.hasNext()){
			full = getNextEmployee(sc);
			if(full.Getgrosspay() > bestpaid.Getgrosspay())
				bestpaid = full;
		}
			if(bestpaid.Getgrosspay() ==0.00)
				return null;
			return bestpaid;
		
	}
	private FullTimeEmployee getNextEmployee(Scanner sc){
		Scanner linescanner = new Scanner(sc.nextLine());
		String name = linescanner.next();
		double grosspay = linescanner.nextDouble();
		return new FullTimeEmployee(name, grosspay);
	}
}
