package solarCalaculator;

import java.util.Scanner;


public class calculatorDev {
	
	public static int sum(int a, int b)
	{
		return(a+b);
		
		
	}
	public static int subtract(int a, int b)
	{
		return(a-b);//System.out.println(a-b);
		
	}
	public static int multiply(int a, int b)
	{
		return(a*b);//System.out.println(a*b);
	}
	public static int divide(int a, int b)
	{
		if(b==0)
			System.out.println("Denaminator can't be Zero");
		return(a/b);//System.out.println(a/b);
	}

	public static void main(String[] args) {
		// This main method will read 2 integer values from terminal and call the above methods
		int x,y;
		System.out.println("Enter two integer values for X and Y Variables to perform arthmatic operations");
		Scanner snr=new Scanner(System.in);
		x=snr.nextInt();
		y=snr.nextInt();
		
		System.out.println("The Addition of both x and y are: "+calculatorDev.sum(x, y));
		
		System.out.println("The Substration value of both x and y are: "+calculatorDev.subtract(x, y));
		
		System.out.println("The Multiplication value of both x and y are: "+calculatorDev.multiply(x, y));
		
		System.out.println("The Divide value of both x and y are: "+calculatorDev.divide(x, y));
		
	}

}
