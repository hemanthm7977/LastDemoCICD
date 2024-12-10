
public class Fibonaccii_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 0;
		int a2 = 1;
		int n = 15;
		
		System.out.print("Fibonaccii_Series are " +a1 +" "+ a2 +" ");
		

		for (int i = 2; i < n; i++) {

			int a3 = a1 + a2;
			System.out.print(a3 +" ");
			a1 = a2;
			a2 = a3;

		}

	}

}
