import java.util.*;
public class binsearch {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		int array[] = new int[n];
		for(int i =0; i < n; i++){
			array[i] = in.nextInt();
		}
		bublsrt(array,n);
		
		int f = 0;
		int l = n-1;
		int mid = (f+l)/2;

		System.out.println("Enter search:");
		int s = in.nextInt();
		
		while(f<=l){
			
		if(s > array[mid])
			f=mid+1;
		else if (s<array[mid])
			l=mid-1;
		else{
			System.out.println("fUONND");
		break;	
		}
		mid = (f+l)/2;
	}
		
		System.out.println("not found");
		}
	public static void bublsrt(int[] array, int n){
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
		
	}
}
