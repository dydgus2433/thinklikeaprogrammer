import java.util.Scanner;

public class seat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int height = sc.nextInt();
		int searchNum  = sc.nextInt();
		int cnt = 1;
		int[][] arr = new int[height][width];
		
		int[] initNum = new int[4];
		int fillCnt = 0;
		
		while(cnt <= width * height) {
			if(fillCnt%4 == 1) {
				for(int i = initNum[fillCnt%4] ; i+ (initNum[fillCnt%4]) < width ; i++) {					
				
					if(arr[initNum[fillCnt%4]][i] == 0) {
						arr[initNum[fillCnt%4]][i] = cnt;
						cnt++;
					}									
				}
			}else if(fillCnt%4 == 2) {
				for(int i = 0; i < height - initNum[fillCnt%4] - 1 ; i++) {
					if(arr[i][width-initNum[fillCnt%4]-1] == 0) {
						arr[i][width-initNum[fillCnt%4]-1] = cnt;
						cnt++;
					}	
				}
			}else if(fillCnt%4 == 3) {
				for(int i =width- (initNum[fillCnt%4])-1; initNum[fillCnt%4] < i ; i--) {
					if(arr[height - initNum[fillCnt%4]-1][i] == 0) {
						arr[height - initNum[fillCnt%4]-1][i] = cnt;
						cnt++;
					}	
				}
			}else if(fillCnt%4 == 0) {
				for(int i = height- (initNum[fillCnt%4])-1 ; (initNum[fillCnt%4]) < i; i-- ) {
					if(arr[i][initNum[fillCnt%4]] == 0) {
						arr[i][initNum[fillCnt%4]] = cnt;
						cnt++;
					}	
				}
				
			}		
			initNum[fillCnt%4]++;
			fillCnt++;
		}
		
		int x = 0; 
		int y =0;
		for(int i =0; i < height; i++) {
			for(int j =0; j < width; j++) {				
				if(searchNum == arr[i][j]) {
					x = j + 1;
					y = height -i;					
				}
			}
		}
		
		if(x == 0 && y ==0) {
			System.out.println(0);
		}else {
			System.out.println(x + " " + y);
		}
		
		
	}

}
