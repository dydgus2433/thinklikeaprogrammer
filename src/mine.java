import java.util.Scanner;

public class mine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ROW =  sc.nextInt();
		int COL = sc.nextInt();
		
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		int[][] arr = new int[ROW][COL];
		
		for(int i =0; i < ROW; i++) {
			for(int k = 0; k < COL; k++) {
				arr[i][k] = sc.nextInt();
			}
		}
		int cnt = 0;
		boolean bGameOver = false;
		if(arr[x][y] == 1) {
			bGameOver = true;			
		}
		
		if(!bGameOver) {
			
			for(int i =0; i < ROW; i++) {
				for(int k = 0; k < COL; k++) {
					if(i == x && y == k) {
						
						//up
						if(i > 0) {
							cnt+= arr[i-1][k];
							//left
							if(k > 0) {
								cnt+= arr[i-1][k-1];
							}
							//right
							if(k < COL) {
								cnt+= arr[i-1][k+1];
							}
						}
						
						//down
						if(i < ROW) {
							cnt+= arr[i+1][k];
							//left
							if(k > 0) {
								cnt+= arr[i+1][k-1];
							}
							//right
							if(k < COL) {
								cnt+= arr[i+1][k+1];
							}
						}
						//left
						if(k > 0) {
							cnt+= arr[i][k-1];
						}
						//right
						if(k < COL) {
							cnt+= arr[i][k+1];
						}
						break;
					}
					
				}
			}

		}
		if(bGameOver) {
			System.out.println("game over");
		}else {
			System.out.println(cnt);
		}

	}

}
