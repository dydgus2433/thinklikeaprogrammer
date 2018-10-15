import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		int[] arr = new int[5];
		for(int i =0; i < arr.length; i++) {			
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == a) {
				count++;
			}			
		}
		
		System.out.print(count);

	}

}
