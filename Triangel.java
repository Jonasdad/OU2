package OU2;

import java.util.*;
import java.lang.Math;
public class Triangel{

	public static double bisektris(double a, double b, double vinkel)
	{
			double n = 2 * a * b * Math.cos(vinkel / 2);
			double Bis = n / (a + b);

			return Bis;

		}
	public static double radieOmskrivenCirkel (double a, double b, double c)
	{
			double s = (a + b + c) / 2;
			double omskrivenCirkel = (a*b*c)/(4 * Math.sqrt(s*(s - a)*(s - b)*(s - c)));

			return omskrivenCirkel;

		}
	public static double radieInskrivenCirkel (double a, double b, double c)
	{
			double s = (a + b + c) / 2;
			double ric = Math.sqrt(s*(s - a)*(s - b)*(s - c))/s;

			return ric;

		}
	public static void main(String [] args)
	{
		double ric = radieInskrivenCirkel(3, 4, 5);
		System.out.println(ric);

		double roc = radieOmskrivenCirkel(3, 4, 5);
		System.out.println(roc);

		double bis = bisektris(3, 4, 2*Math.PI);
		System.out.println(Math.abs(bis));
		}

}