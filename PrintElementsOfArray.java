package arrayDay3;

public class PrintElementsOfArray {
	static String[] names= {"Rohit", "Rahul", "Virat", "Sky","DK"};
	
	public static void main(String[] args) {
		System.out.println("Elements of array are: ");
		for (int i = 0; i < names.length; i++) {
			System.out.print( names[i] + " ");
		}
	}
}
