import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		
		for(int i =0; i < 5; i++) {
			for(int j =0; j <5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
//		arr = new int[][] {{11,12,2,24,10},{16,1,13,3,25},{6,20,5,21,17},{19,4,8,14,9},{22,15,7,23,18}};

		
//		int[][] answer1 = new int[][] 
//				{{5,10,7,16,2},
//				{4,22,8,17,13},
//				{3,18,1,6,25},
//				{12,19,23,14,21},
//				{11,24,9,20,15}};
		int[] answer = new int[25];
//		int[] answer = new int[] {5,10,7,16,2,
//				4,22,8,17,13,
//				3,18,1,6,25,
//				12,19,23,14,21,
//				11,24,9,20,15};

		for(int i =0; i < 25; i++) {
			answer[i] = sc.nextInt();
		}
		
		int bingo = 0;
		for(int k = 0; k < 25; k++) {		
			
			for(int i =0; i < 5; i++) {			
				for(int j =0; j < 5; j++) {
					if(arr[i][j] == answer[k]) {
						arr[i][j] = 0;
						int temp = 0;
						int temp1 = 0;
						int temp2 = 0;
						int temp3 = 0;
						for(int ii =0; ii < 5; ii++) {
							
							if(arr[i][ii] == 0) {
								temp++;
								if(temp == 5) {
									bingo++;
								}
							}
							if(arr[ii][j] == 0) {
								temp1++;
								if(temp1 == 5) {
									bingo++;
								}
							}
							if(i==j && arr[ii][ii] == 0) {
								temp2++;
								if(temp2 == 5) {
									bingo++;
								}
							}
							if(j+i == 4 && arr[4-ii][ii] == 0) {
								temp3++;
								if(temp3 == 5) {
									bingo++;
								}
							}
							
							
						}
					}
				}
			}
			if(bingo >= 3) {
				System.out.println(k+1);
				break;
			}
		}
	}

}
