//최소값을 앞으로 이동시킴
public class 선택정렬 {

	public static void main(String[] args) {
		
		int[] arr = {23,4,5,2,3,6,7,11,323,1230,3123,123,4512,34123,512,3123123,213,112};
		


		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int j = 0; j < arr.length; j++) {
			int num = arr[j];
			int idx = j;
			for(int i = j+1;  i < arr.length; i++) {
				if(num > arr[i]) {
					num = arr[i];
					idx = i;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[j];
			arr[j] = temp;
		}
		
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
