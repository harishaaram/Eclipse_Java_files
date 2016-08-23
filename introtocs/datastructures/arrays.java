package introtocs.datastructures;

import java.util.ArrayList;


public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] evenNums = {2,4,6,8,10};
		System.out.println(evenNums[2]);
		for(int i =0; i < evenNums.length;i++)
			System.out.println(evenNums[i] + 1);
		
		ArrayList<String> bday = new ArrayList<String>();
		bday.add("this is 1");
		bday.add("this is 2");
		bday.add("this is 3");
		
		System.out.println(bday.get(2));
		
		bday.set(2, "this is 3 is changed");
		for(int i =0; i < bday.size();i++)
			System.out.println(bday.get(i));
		
	}

}
