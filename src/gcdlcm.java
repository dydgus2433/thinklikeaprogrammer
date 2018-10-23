import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class gcdlcm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Integer> arr3 = new ArrayList<>();
		int gcd =0;
		int lcm = 1;
		
		for(int i =1; i <= num1; i++) {
			if(num1 % i ==0) {
				arr1.add(i);
			}
		}
		
		for(int i =1; i <= num2; i++) {
			if(num2 % i ==0) {
				arr2.add(i);
			}
		}
		//System.out.println(arr1.toString());
		for(int i =0; i < arr1.size(); i++) {
			for(int j =0; j < arr2.size(); j++) {
				if(arr1.get(i) == arr2.get(j)) {
					gcd = arr2.get(j);					
				}
			}
		}

		System.out.println(gcd);
		
		int temp1 = num1; 
		int temp2 = num2;
		int cnt = 2;
		while(true) {
			
			if(temp1 % cnt == 0 && temp2 % cnt == 0) {
				arr3.add(cnt);
				temp1 /= cnt;
				temp2 /= cnt;
				continue;
			}else {
				
				if((cnt > temp1  || cnt > temp2) ) {
					arr3.add(temp1);
					arr3.add(temp2);
					break;
				}else {
					cnt++;
				}
			}
		}
		//System.out.println(arr3.toString());
		
		for(int i = 0 ; i < arr3.size(); i++) {
			lcm *= arr3.get(i);
		}
		System.out.println(lcm);
	}

}
