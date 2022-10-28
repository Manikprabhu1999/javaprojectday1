package com.bridgelabz;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year::");
		Scanner r= new Scanner(System.in);
		year = r.nextInt();
		
	if ( ((year%4 == 0) && (year%100!=0)) || (year%400 == 0))
		System.out.println("its a leap year");
	else
		System.out.println("its not a leap year");
		
		
	}
}
