import java.util.*;
public class check {
	public static void main(String[] args){
		new check().run();
	}
	public void run()
	{
	final int SENTINEL = -1;
	final String INPUT_PROMPT = "\nPlease enter a test score (or " +
	SENTINEL + " to quit): ";
	final String SUM_MESSAGE = "\n\nThe sum of the scores is ";
	Scanner sc = new Scanner (System.in);
	int score,
	sum = 0;
	while (true)
	{
	System.out.print (INPUT_PROMPT);
	score = sc.nextInt();
	if (score == SENTINEL)
	break;
	sum += score;
	} // while
	System.out.println (SUM_MESSAGE + sum);
	} // method run
	}

