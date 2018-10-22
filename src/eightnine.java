import java.util.Scanner;

public class eightnine {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		int[][] arr = new int[height][width];
		
		for(int i = 0; i < height; i++){
		  for(int j = 0 ; j < width; j++){
			  arr[i][j] = sc.nextInt();			  			  
		  }		
		}
	
		for(int i = 0; i <height ; i++){
			  for(int j = 0 ; j <  (width%2==1 ?width/2 +1 : width /2 ); j++){
				  int temp = 0;
				  temp = arr[i][j]; 
				  arr[i][j] = arr[i][width-1-j];
				  arr[i][width-1-j] = temp;
			  }
		}
		
		for(int i = 0; i < height; i++){
		  for(int j = 0 ; j < width; j++){
			  System.out.print(arr[i][j]+" ");
		  }		
		  System.out.println();
		}
	
	
	}

}
