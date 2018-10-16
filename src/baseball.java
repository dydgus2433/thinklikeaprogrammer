import java.util.ArrayList;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answerCnt = sc.nextInt();
		
		//서로 다른 세 숫자를 마음속으로 생각한다 ( 랜덤수) 각각 다름
		
		int a = 324;
		
		//다른 세자리수를 묻는다
		int b = 123;
		//스트라이크 볼로 대답한다.
		int strike = 1;
		int ball = 1;
		//3스트라이크면 게임이 끝난다.
		if (strike == 3 ) {
			System.out.println("end");
		}
		//아니라면 다시 묻는다
		else {
	
			System.out.println("continue");
		}
		
		//영수가 생각하고 있을 가능성이 있는 수가 총 몇 개인지를 알아맞혀야 한다.
		 
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> numArr = new ArrayList<>();
//		ArrayList<Integer> strikeArr = new ArrayList<>();
//		ArrayList<Integer> ballArr = new ArrayList<>();
//		for(int ii = 1; ii < 10; ii++) {
//			numArr.add(ii);
//		}
//		System.out.println(numArr.toString());
//		String question = "";
//		for(int i =0 ; i < answerCnt; i++) {
//			question = sc.next();		
//			
//			int strike = sc.nextInt();
//			int ball = sc.nextInt();
//			
//			if(strike == 0 && ball == 0) {
//				for(int jj =0; jj < 3; jj++) {
//					for(int j =0; j < numArr.size(); j++) {
//					
//					 
////						System.out.println(question.charAt(jj));
//						if(Integer.parseInt(question.charAt(jj)+"") == numArr.get(j)) {
//							numArr.remove(j);
////							System.out.println(numArr.toString());
//							break;
//						}
//					}
//				}
////				numArr.remove();
//			}else if(strike == 1 && ball == 0) {
//				
//				//
//				
//				
//				
//			}else if(strike == 1 && ball == 1) {
//				
//			}else if(strike == 1 && ball == 2) {
//				
//			}else if(strike == 2 && ball == 0) {
//				
//			}else if(strike == 3 && ball == 0) {
//				
//			}
//			
//			
//		}	
//		System.out.println(numArr.toString());
//		
//		int result = 1;
//		for(int jj =0; jj < 3; jj++) {				
//			result *= (numArr.size() - jj);
//		}
//		System.out.println(result);
//	
	}
}
