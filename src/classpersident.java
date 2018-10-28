import java.util.Scanner;

public class classpersident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int classMateCnt = sc.nextInt();
		
		int[] bestPointClass = new int[classMateCnt];
		int[][] classMate = new int[classMateCnt][5];
		
		for(int i = 0; i < classMateCnt; i++) {
			for(int k =0 ; k < 5; k++) { 
				classMate[i][k] = sc.nextInt();
			}
		}
		
		
		
		for(int i = 0; i < classMateCnt; i++) {				
				for(int j =0; j < classMateCnt; j++) {
					for(int jj = 0; jj < 5; jj++) {						
						if((classMate[i][jj] == classMate[j][jj]) && (i != j)) {						
							bestPointClass[i]++;
							break;
						}
					}
				}
			
		}
		
		int max = 0;
		int index = 0;
		for(int k = 0 ; k < classMateCnt; k++) {
			if(k == 0) {
				max = bestPointClass[k];				
			}
			
			if(max < bestPointClass[k]) {
				max = bestPointClass[k];
				index = k;
			}
		}
		
		System.out.println(index + 1);
	}

}

