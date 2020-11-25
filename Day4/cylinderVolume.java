package Day4;

import java.util.Scanner;

public class cylinderVolume {
	public static void main(String[]args) {
		final double PI= 3.14;
		Scanner input=new Scanner(System.in);
		System.out.println("enter radius 1:");
		double r =input.nextDouble();
		System.out.println("enter height 2:");
		double h=input.nextDouble();
		
		Double volume=PI*Math.pow(r, 2)*h;
		System.out.println("volume of cylinder:"+volume);
		
		
		
		
	}

}
  