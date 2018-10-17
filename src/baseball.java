import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answerCnt = sc.nextInt();
				
		ArrayList<Integer> numArr = new ArrayList<>();
		ArrayList<Integer> inputArr = new ArrayList<>();
		
		ArrayList<Integer> strikeArr = new ArrayList<>();
		ArrayList<Integer> ballArr = new ArrayList<>();
		
		HashSet<Integer> answerArr = new HashSet<>();
		
		for(int i = 0; i < answerCnt; i++) {
			inputArr.add( sc.nextInt() );
			strikeArr.add( sc.nextInt() );
			ballArr.add( sc.nextInt() );
		}
		
		
		
		for(int ii = 123; ii <=987; ii++) {			
			int first = ii /100;
			int second = (ii % 100) /10;
			int third = (ii % 100) %10;			
			if((first != second)  && (second != third) && (first != third)&& (first != 0 && second != 0 && third != 0)) {
				numArr.add(ii);
			}						
		}
		
		
		for(int iii =0; iii < numArr.size(); iii++) {
			
			
			int first = numArr.get(iii) /100;
			int second = (numArr.get(iii) % 100) /10;
			int third = (numArr.get(iii) % 100) %10;	
			
			
			for(int j =0; j < inputArr.size(); j++) {
				int strikeCnt = 0;
				int ballCnt = 0;
				int inFirst = inputArr.get(j) /100;
				int inSecond = (inputArr.get(j) % 100) /10;
				int inThird = (inputArr.get(j) % 100) %10;	
				
				if(first == inFirst ) {
					strikeCnt++;
				}else{
					if(second == inFirst) {
						ballCnt++;
					}else if(third == inFirst) {
						ballCnt++;
					}
					
				}
				
				if(second == inSecond ) {
					strikeCnt++;
				}else {
					if(first == inSecond) {
						ballCnt++;
					}else if(third == inSecond) {
						ballCnt++;
					}
				}
				
				if(third == inThird ) {
					strikeCnt++;
				}else {
					if(first == inThird) {
						ballCnt++;
					}else if(second == inThird) {
						ballCnt++;
					}
				}
				if(strikeArr.get(j) == strikeCnt && ballArr.get(j) == ballCnt) {
					if(j == inputArr.size()-1) {
						answerArr.add(numArr.get(iii));
					}					
				}else {
					break;
				}
				
				
			}
			
		}
		
		System.out.println(answerArr.size());
	
	}
}
