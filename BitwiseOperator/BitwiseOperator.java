import java.util.Scanner;
public class BitwiseOperator
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c;

		System.out.print("Enter the number A : ");
		a = input.nextInt();

		System.out.print("Enter the number B : ");
		b = input.nextInt();

		c = a & b;
		System.out.println("Value of a & b is : "+c);

		c = a | b;
		System.out.println("Value of a | b is : "+c);

		c = a ^ b;
		System.out.println("Value of a ^ b is : "+c);

		c = a >> 3;
		System.out.println("Value of a>>3 is : "+c);

		c = a << 3;
		System.out.println("Value of a<<3 is : "+c);

		c = a >> 2;
		System.out.println("Value of a>>2 is : "+c);

		c = a << 2;
		System.out.println("Value of a<<2 is : "+c);


	}
}