import java.util.Scanner;
public class Main{
 public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static int gcd(int a, int b, int c) {

		return gcd(gcd(a, b), c);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		int num2 = input.nextInt();
		
		int num3 = input.nextInt();
		int gcdofnumbers = Main.gcd(num1, num2, num3);
		System.out.println(+ gcdofnumbers);

}}