package homework3;

import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner first = new Scanner(System.in);
		System.out.print("insert num1");
	num1= first.nextInt();
	
	System.out.print("insert num2");
	num2= first.nextInt();
	
	System.out.print("insert num3");
	num3= first.nextInt();
	if(num1>num2&& num1>num3 ) {
		System.out.print("The greatest number is "+num1);
	}
	if (num2>num1&& num2>num3) {
	System.out.print("The greatest number is " +num2);	
	}
	if (num3>num1&& num3>num2) {System.out.print("The greatest number is " +num3);
	}

	}

}
