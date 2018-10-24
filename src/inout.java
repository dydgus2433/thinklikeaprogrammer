import java.util.Scanner;

public class inout {

	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		for(int j = 0; j < num; j++) { //1..2..3.
			for(int i = 0; i < 10 ; i ++) {
				
				for(int k = 0; k < 10; k++) {
					if(j==k) {
						arr[j][i]++;
					}
					
					if(j==i ) {
						arr[k][j]++;
					}
					
					if(i == k && i == j) {
						arr[i][i] ++;
					}
					
					
					
				}
				
				
				
			}
		}
		
		
		for(int i =0; i < 10; i++) {
			for(int j =0; j < 10; j++) {
				System.out.print(arr[i][j]%2+ " ");
			}
			System.out.println();
		}
		

	}

}
