import java.util.ArrayList;
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
		
		for(int i =2; i < num1; i++) {
			if(num1 % i ==0) {
				arr1.add(i);
			}
		}
		
		for(int i =2; i < num2; i++) {
			if(num2 % i ==0) {
				arr2.add(i);
			}
		}
		System.out.println(arr1.toString());
		for(int i =0; i < arr1.size(); i++) {
			for(int j =0; j < arr2.size(); j++) {
				if(arr1.get(i) == arr2.get(j)) {
					gcd = arr2.get(j);
					
				}else {
					arr3.add(arr2.get(j));
				}
			}
		}
		System.out.println(arr1.toString());
		System.out.println(gcd);
		
		for(int i =0; i < arr1.size(); i++) {
			lcm *= arr1.get(i);
		}
		System.out.println(lcm);
	}

}
