package introtocs.intermediate;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] birds = {"peacock","hen","eagle"};
		String[] animals = {"tiger","lion","deer","panther"};
		String[] insects = {"ant","cricket"};


		String[][] zoo = {birds,animals,insects};
		for(int i =0; i < zoo.length ; i++)
			for(int j =0;j < zoo[i].length;j++)
				System.out.println(zoo[i][j]);
	}

}
