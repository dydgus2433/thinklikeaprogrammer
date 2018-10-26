import java.util.Scanner;

public class attackrange {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		
		int range = sc.nextInt();
		
		int [][] arr = new int[size][size];
		
		
		
		for(int i = range; 0 < i; i--) {
			for(int j = 0; j <= i; j++) {
				
				//x - 2 , y  ---> x , y+ 2
				if( (x-i+j >= 0 && x-i+j < size) && (y+j >= 0 && y+j < size) ) {
					arr[x- i +j][y+j] = i;
				}
				//x , y - 2 ----> x +2 , y 
				if((x+j >= 0 && x+j < size) &&(y-i+j >= 0 && y-i+j < size) ) {
					arr[x+ j][y-i+j] = i;
				}
//				//x , y - 2 ----> x -2, y 
				if((x+i-j >= 0 && x+i-j < size) &&(y+j >= 0 && y+j < size) ) {
					arr[x+i-j][y+j] = i ;
				}
//				
//				
//				//x + 2, y ---? x , y + 2
				if((x-j >= 0 && x-j < size) &&(y-i+j >= 0 && y-i+j < size )) {
					arr[x-j][y-i+j] = i;			
				}
				
				
			}
		}
		
		for(int i =0; i < size; i++) {
			for(int j =0; j < size; j++) {
				if(i == x && j == y) {
					System.out.print("x ");
				}else {
					System.out.print(arr[i][j]+" ");
				}				
			}
			System.out.println();
		}
		

	}

}
