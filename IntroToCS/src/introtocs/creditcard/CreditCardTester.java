package introtocs.creditcard;

import java.util.ArrayList;

public class CreditCardTester {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		CreditCard card  = new CreditCard("hari", 2500);
		System.out.println(card.getCardholder());
		System.out.println(card.getCreditLimit());
		card.makePurchase(5000);
		card.makePayment(6500);
		System.out.println(card.getBalance());
		System.out.println(card.calculateRewardPoints());
		card.makePurchase(500);

		System.out.println(card.calculateRewardPoints());

		System.out.println(card.getCreditLimit());

		System.out.println(card.getBalance());
		
		ArrayList<CreditCard> cards1 = new ArrayList<CreditCard>();
		

		CreditCard card1  = new CreditCard("harish", 2000);
		CreditCard card2  = new CreditCard("suresh", 500);
		CreditCard card3  = new CreditCard("ramesh", 5000);
		
		card1.makePurchase(7000);
		card1.makePurchase(100);
		card1.makePurchase(200);

		card2.makePurchase(200);
		card2.makePurchase(100);
		
		card3.makePurchase(500);

		card1.makePayment(1000);

		card2.makePayment(400);

		card3.makePayment(10000);

		cards1.add(card1);

		cards1.add(card2);
		cards1.add(card3);
		
		for(CreditCard CARDS: cards1){
			System.out.println("NAME:" + CARDS.getCardholder());
			System.out.println("BALANCE: "+ CARDS.getBalance());
			System.out.println("Credit LIMIT:" + CARDS.getCreditLimit());
			System.out.println("POINTS:"+CARDS.calculateRewardPoints());
			System.out.println("--------------------------------------");
			
			
		}
		
		
		
	}

}
