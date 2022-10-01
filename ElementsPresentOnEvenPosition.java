package arrayDay3;

public class ElementsPresentOnEvenPosition {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 3, 1, 0 };
		int arrayLength = 5;
		for (int i = 0; i <= arrayLength; i++) {
			if (i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
