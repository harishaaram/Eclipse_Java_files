import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		int array[] = new int[n];
		for(int i =0; i < n; i++){
			array[i] = in.nextInt();
		}
		int swap;
			for(int j =0;j <n;j++){
				for(int i=0;i<n-1;i++){
					if(array[i] > array[i+1]){
						swap = array[i];
						array[i] = array[i+1];
						array[i+1] = swap;
					}
				}
			}
			for(int j =0;j <n;j++)
				System.out.println(array[j]);
			
	}

}
