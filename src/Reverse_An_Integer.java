
public class Reverse_An_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int actual = 123456789;
		int reversed = 0;
		
		while(actual>0)
		{
			int digit = actual%10;
			reversed = reversed*10+digit;
			actual=actual/10;
		}
		
		System.out.println(reversed+" Reveresed integer");

	}

}
