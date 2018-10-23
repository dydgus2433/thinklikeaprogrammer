
public class 버블정렬 {

	public static void main(String[] args) {
		int[] arr = {23,4,5,2,3,6,7,11,323,1230,3123,123,4512,34123,512,3123123,213,112};
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i =0 ; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int k =0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
