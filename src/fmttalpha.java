import java.util.Scanner;

public class fmttalpha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 1 1 1  = 3

		1 2 1 = 4 
		
		1 2 1 1 = 5 ------- 4
		
		1 2 2 1 = 6
		
		1 2 2 1 1 = 7 ---------5
		
		1 2 2 2 1 = 8 
		
		1 2 3 2 1 = 9 
		
		1 2 2 2 2 1 = 10 --------6
		
		1 2 3 2 2 1 = 11
		
		1 2 3 3 2 1 = 12
		
		1 2 3 2 2 2 1 = 13 -------7
		
		1 2 3 3 2 2 1 = 14
		
		1 2 3 3 3 2 1 = 15
		
		1 2 3 4 3 2 1 = 16

		 */
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num = y - x;
		int add = 0;
		int cnt = 0;
		while(true) {
			
			cnt++;
			
			if(num <= add ) {
				if(num == add+1) {
					cnt++;
				}
				break;			
			}else {
				
				add+=cnt;
			}
			System.out.println(add + " : " + cnt);
		}
		System.out.println(cnt);
		
		

	}

}
