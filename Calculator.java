package Calculation;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		double res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		double a = sc.nextDouble();
		
		System.out.println("Choose any case: ");
		char op = sc.next().charAt(0);
		
		System.out.println("Enter the Second  Number : ");
		double b = sc.nextDouble();
		
		
		switch(op) {
		case '+' : 
			res = a+b;
			System.out.println("A + B = " + res);
			break;
			
		case '-' : 
			res = a-b;
			System.out.println("A - B = " + res);
			break;
			
		case '*' : 
			res = a*b;
			System.out.println("A * B = " + res);
			break;
			
		case '/' : 
			res = a/b;
			System.out.println("A / B = " + res);
			break;
			
		case '%' : 
			res = a%b;
			System.out.println("A % B = " + res);
			break;	
				
		}

	}

}
