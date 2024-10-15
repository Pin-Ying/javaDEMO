package javatest;

import java.util.Scanner;

public class nums {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		Scanner num3 = new Scanner(System.in);
		
		int n1 = num1.nextInt();
		int n2 = num2.nextInt();
		int n3 = num3.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("最大值:"+n1);
		}
		else if (n2>n3) {
			System.out.println("最大值:"+n2);
		}
		else {
			System.out.println("最大值:"+n3);
		}
		
		num1.close();
		num2.close();
		num3.close();

	}

}
