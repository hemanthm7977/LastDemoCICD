
public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String actual = "Hemanth Hi";
		String reversed = "";
		System.out.println(actual + " Actual string");

		for (int i = actual.length(); i > 0; i--) {
			// System.out.println(actual.charAt(i-1));
			reversed = reversed + actual.charAt(i - 1);
		}
		System.out.println(reversed + " reversed string");

	}
	

}
