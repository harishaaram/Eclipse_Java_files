package decToBinary;

public class binary {
	public String bintodec(int n){
		if(n <=1)
			return Integer.toString(n);
		
			return bintodec(n/2)+Integer.toString(n%2);
	}
	public String fibonacci(int m){
		if(m == 1)
			return Integer.toString(1);
		else if(m == 2)
			return Integer.toString(1)+Integer.toString(1);
		else
			return fibonacci(m-1) + fibonacci(m-2)
		
	}

}
