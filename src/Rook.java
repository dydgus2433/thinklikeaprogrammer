import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[8][8];
		int result = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == 1) {					
					// right
					for (int k = j; k < 8; k++) {
						if (arr[i][k] == 2) {
							result = 1;
						} else if (arr[i][k] == 3) {
							break;
						}
					}
					// left
					for (int k = j; 0 < k; k--) {
						if (arr[i][k] == 2) {
							result = 1;
						} else if (arr[i][k] == 3) {
							break;
						}
					}
					// up
					for (int k = i; k < 8; k++) {
						if (arr[k][j] == 2) {
							result = 1;
						} else if (arr[k][j] == 3) {
							break;
						}
					}
					// down
					for (int k = i; 0 < k; k--) {
						if (arr[k][j] == 2) {
							result = 1;
						} else if (arr[k][j] == 3) {
							break;
						}
					}

				}
			}
		}

		System.out.println(result);

	}

}
