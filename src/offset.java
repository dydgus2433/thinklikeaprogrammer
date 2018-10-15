import java.util.Scanner;

public class offset {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		String[][] strArr = new String[5][5];
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
//				arr[i][j] = (int) (Math.random()*100 %10);
			}
		}		
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				strArr[i][j] = arr[i][j]+"";
				
				if(i == 0 && j ==0) {
					if(arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i][j+1]) {
						strArr[i][j] = "*";
					}
				}else if(i== 4 && j==0) {
					if(arr[i][j]  < arr[i][j+1] && arr[i][j] < arr[i -1][j]) {
						strArr[i][j] = "*";
					}					
				}else if(i == 0 && j ==4) {
					if(arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i][j-1]) {
						strArr[i][j] = "*";
					}
				}else if(i== 4 && j==4) {
					if(arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i-1][j]) {
						strArr[i][j] = "*";
					}					
				}else if(i == 0 && j < 4) {
					if(arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i][j-1]) {
						strArr[i][j] = "*";
					}
				}else if(j == 0 && i < 4) {
					if(arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i-1][j]) {
						strArr[i][j] = "*";
					}
				}else if(i == 4) {
					if(arr[i][j] < arr[i-1][j] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i][j-1]) {
						strArr[i][j] = "*";
					}
				}else if(j == 4) {
					if(arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i-1][j]) {
						strArr[i][j] = "*";					
					}
				}else{
					if(arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i-1][j]) {
						strArr[i][j] = "*";
					}
				}
				
				
			}
		}
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {				
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
