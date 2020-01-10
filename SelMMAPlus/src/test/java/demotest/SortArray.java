package demotest;

public class SortArray {

	public static void main(String[] args) {
		int [] arr  = {3, 2, 5, 1};
		int temp;
		for (int i = 0; i < arr.length; i ++) {
			for (int j = i; j < 0; j++) {
				if (arr[j] > arr[j -1]) {
					temp = arr[j];
					System.out.println("temp 1:  "+temp);
				}
				
			}
		}

	}

}
