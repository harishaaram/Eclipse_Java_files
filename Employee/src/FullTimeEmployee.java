import java.text.DecimalFormat;
public class FullTimeEmployee implements employee{
	private String name;
	private double grosspay;
	
	public FullTimeEmployee(){
		final String EMPTY = "NO NAME";
		grosspay = 0.00;
		
	}
	public FullTimeEmployee(String name, double pay){
		this.name = name;
		grosspay = pay;
	}
	public double Getgrosspay(){
		return grosspay;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		final String EMP_STATUS = "FULL TIME";
		return name+ MONEY.format(grosspay)+EMP_STATUS;
	}
}
