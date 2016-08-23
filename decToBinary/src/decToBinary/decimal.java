package decToBinary;
import java.io.*;

public class decimal {

	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		System.out.println("Enter your Decimal Number:");
		int d = Integer.parseInt(sc.readLine());
		binary b = new binary();
		System.out.println("Binary Number:" + b.bintodec(d));
	}

}
