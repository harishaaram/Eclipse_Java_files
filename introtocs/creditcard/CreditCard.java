package introtocs.creditcard;

public class CreditCard{
	private int creditLimit; //dollars not in cents so only int
	private int balance;
	private String cardholder;
	
	private int purchases;
	
	/**
	 * Constructs a credit card with datas
	 * @param name
	 */
	public CreditCard(String name){
		cardholder = name;
		creditLimit = 500;
		balance = 0;
		purchases = 0;
		
	}
	/**
	 * name and limit
	 * @param name
	 * @param creditLimit
	 */
	public CreditCard(String name, int creditLimit){
		this.creditLimit = creditLimit;
		balance = 0;
		purchases = 0;
		cardholder = name;
	}
	/**
	 * gets the credit limit
	 * @return-- the credit limit
	 */
	public int getCreditLimit(){
		return creditLimit;
		
	}
	/**
	 * balance 
	 * @return=-- the balance
	 */
	public int getBalance(){
		return balance;
	}
	public String getCardholder(){
		return cardholder;
	}
	/**
	 * makes purchase to see balance of credit card
	 * @param amt
	 */
	public void makePurchase(int amt){
		int availableCredit = creditLimit - balance;
		if(amt > availableCredit)
			balance = balance + amt +50;
		else{
			balance = balance + amt;
		purchases++;
		}
	}
	/**
	 * make payment to credit card company
	 * @param amt
	 */
	public void makePayment(int amt){
		balance = balance - amt;
	}
	public int calculateRewardPoints(){
		int points = 0;
		for(int i =0;i < purchases; i ++){
			points= points+100;
			
		}
		return points;
		
	}
}