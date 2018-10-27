import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class classpersident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int classMateCnt = sc.nextInt();
		
		int[] bestPointClass = new int[5];
		int[] bestNum = new int[9];
		int[][] classMate = new int[5][classMateCnt];
		
		for(int i = 0; i < classMateCnt; i++) {//학년 
			for(int k =0 ; k < 5; k++) { //학생
				classMate[i][k] = sc.nextInt();
			}
		}
		for(int i = 0; i < classMateCnt; i++) {		
			for(int k = 0; k < 5; k++) {	
				//9개 숫자중에 
				for(int j =0; j < bestNum.length; j++) {
					if(classMate[i][k] == j) {
						bestNum[j]++;
					}
				}
				
				
				for(int j =0; j < bestNum.length; j++) {
					if(classMate[i][k] == j) {
						classMate[5][k] += bestNum[j];
					}
				}
				bestNum = new int[9];
			}
		}
		
		for(int k = 0 ; k < classMateCnt; k++) {
				System.out.println(classMate[5][k]);
		}
		
		
		for(int i = 0; i < 6; i++) {		
			for(int k = 0 ; k < classMateCnt; k++) {
				System.out.print(classMate[i][k]+" ");
			}
			System.out.println();
		}
	}

}

