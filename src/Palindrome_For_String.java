
public class Palindrome_For_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual = "madam";
		String reversed = "";

		for (int i = actual.length(); i > 0; i--) {
			reversed = reversed + actual.charAt(i - 1);
		}

		if (actual.equals(reversed)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
