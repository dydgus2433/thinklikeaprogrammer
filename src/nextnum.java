import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class nextnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Map<String, Integer>> arrList = new ArrayList<>();
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			Map<String, Integer> map = new HashMap<>();
			if(num1 == num2 && num2 == num3 && num1 == 0) {
				break;
			}
			
			if(num2 - num1 == num3 - num2) {				
				map.put("AP", num3 * 2 - num2);
				arrList.add(map);
			}else {			
				map.put("GP", num3* (num2/num1));
				arrList.add(map);
			}
			
			
			
			
		}
		
		for(Map<String, Integer> resultMap : arrList) {
			String key  = "AP";
			if(resultMap.containsKey(key)) {
				System.out.println(key + " "+ resultMap.get(key));
			}else {		
				key = "GP";
				System.out.println("GP "+ resultMap.get(key));
			}
		}
	}

}
