import java.text.DecimalFormat;

public interface employee {
	final static DecimalFormat MONEY = new DecimalFormat("$0.00");
	/*
	 * Name of the employee
	 */
	String getName();
	/*
	 * to string (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	String toString();
	double Getgrosspay();

}
