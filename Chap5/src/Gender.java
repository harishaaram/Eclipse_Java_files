
public class Gender {
	int count = 0;
	double totalsalary = 0;
	
	public void update(double salary){
		count++;
		totalsalary = totalsalary + salary;
		
	}
	public double knowsalary(){
		return totalsalary;
	}
	public double knowavg(){
		return totalsalary/count;
		
	}
}
