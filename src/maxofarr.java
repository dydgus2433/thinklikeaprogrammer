import java.util.Scanner;

public class maxofarr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j =0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		int x =0;
		int y = 0;
		for(int i = 0; i < 9; i++) {
			for(int j =0; j < 9; j++) {
				if(arr[i][j] > max) {
					x = i;
					y = j;
					max = arr[i][j];
				}else if(arr[i][j] ==max){
					if(x == i) {
						y = y < j ? y : j;
					}else if(y == j) {
						x = x < i ? x : i;
					}
					
					
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " "+y);
		
	}

}
