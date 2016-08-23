package introtocs.intermediate;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi \" harish\"");
		
		String name = "  Ram   ";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase().trim());
		
		String phrase = "Testing substring method";
		System.out.println(phrase.substring(8,17));
		
		String newphrase = phrase.replace("Testing", "Checking");
		System.out.println(newphrase);
		
		if(phrase.substring(0,7).equalsIgnoreCase("testing"))
			System.out.println("working");
		else
			System.out.println("Inconrect");
		
		
				
	}

}
