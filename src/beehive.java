import java.util.Scanner;

public class beehive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		
		int cnt = 0;
		int stageLarge = 1;
		while(true) {
			if(inputNum <=  (stageLarge + 6 * cnt )) {
				
				break;
			}else {
				stageLarge += 6 * cnt;
				cnt++;
			}
		}
		
		
		System.out.println(cnt + 1);

	}

}
