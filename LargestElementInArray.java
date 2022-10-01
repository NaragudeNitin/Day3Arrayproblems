package arrayDay3;

public class LargestElementInArray {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 3, 1, 0 };
		int arrayLength=5;
		for (int i = 0; i <= arrayLength; i++) {
			for (int j = i; j <= arrayLength; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("Accending order of array is: " + arr[i]);
		}
		System.out.println("So largest number in array is: " + arr[arrayLength]);
		System.out.println("So second largest number in array is: "+ arr[arrayLength-1]);
		System.out.println("Smallest number in arr is: "+(arrayLength-arrayLength));
	}
}
