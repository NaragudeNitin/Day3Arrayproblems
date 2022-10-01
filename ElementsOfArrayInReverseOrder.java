package arrayDay3;

public class ElementsOfArrayInReverseOrder {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 7, 0 };
		System.out.println("original arr");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
