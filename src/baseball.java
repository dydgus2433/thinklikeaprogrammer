import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answerCnt = sc.nextInt();
		
		int answer = 324;
		int question = 0;
		for(int i =0 ; i < answerCnt; i++) {
			question = sc.nextInt();			
			if(question == answer) {
				System.out.print(" 3 0");
			}			
		}		
	}
}
