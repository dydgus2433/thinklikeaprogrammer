//���Ҹ� ���ʴ�� ���ĵ� �迭�� ���Խ�Ŵ
public class �������� {
	public static void main(String[] args) {
		int[] arr = {23,4,5,2,3,6,7,11,323,1230,3123,123,4512,34123,512,3123123,213,112};
		
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//My Answer
		for(int i =1; i < arr.length; i++) {			
			for(int j = i; 0 < j; j--) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			
		}
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//��
		for(int i =0; i < arr.length; i++) {			
			for(int j = i; 1 <= j; j--) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
			
			for(int k =0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
