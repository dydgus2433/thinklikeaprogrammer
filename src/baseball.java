import java.util.ArrayList;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answerCnt = sc.nextInt();
		
		//���� �ٸ� �� ���ڸ� ���������� �����Ѵ� ( ������) ���� �ٸ�
		
		int a = 324;
		
		//�ٸ� ���ڸ����� ���´�
		int b = 123;
		//��Ʈ����ũ ���� ����Ѵ�.
		int strike = 1;
		int ball = 1;
		//3��Ʈ����ũ�� ������ ������.
		if (strike == 3 ) {
			System.out.println("end");
		}
		//�ƴ϶�� �ٽ� ���´�
		else {
	
			System.out.println("continue");
		}
		
		//������ �����ϰ� ���� ���ɼ��� �ִ� ���� �� �� �������� �˾Ƹ����� �Ѵ�.
		 
		
		
		
		
		
		
		
		
		
		
		
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
