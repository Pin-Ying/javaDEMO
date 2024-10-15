package javatest;

import java.util.Scanner;
import java.lang.Math;

public class bmi{
	public static void main(String[] args){
		
		var height = new Scanner(System.in);
		var weight = new Scanner(System.in);
		double h = height .nextInt();
		double w = weight .nextInt();
		double bmi = w/Math.pow((h/100), 2);
		System.out.println(Math.round(bmi*100.0)/100.0);
		
		height.close();
		weight.close();

	}
}