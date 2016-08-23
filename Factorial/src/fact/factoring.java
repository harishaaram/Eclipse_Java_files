package fact;

public class factoring {
	
	public int factorial(int f){
		if(f <= 1)
			return 1;
		return f * factorial(f-1);
	}
}
