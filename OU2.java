package OU2;
import Triangle.*;
import java.util.*;
import java.lang.Math;
public class OU2 {

	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);

		System.out.println("L�ngden av sida a: ");
		double a = in.nextDouble();
		System.out.println("L�ngden av sida b: ");
		double b = in.nextDouble();
		System.out.println("L�ngden av sida c: ");
		double c = in.nextDouble();

		double bas = b;
		double hojd = Triangel.bisektris(a, b, c);

		double area = ((bas * hojd) / 2);
		//double omkrets = Triangel.(a, b, c);

		//ber�kna vinkeln enligt a^2 = b^2 + c^2 - 2bc Cos(A) ger:
		// Cos(A) = (b^2 + c^2 - a^2) /2bc


		}
}