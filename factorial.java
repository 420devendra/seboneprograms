// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class factorial {
	public int facto(int a1 ) {
	    int a=1;
		for(int i=a1; i>0;i--) {
			a=a*i;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number for factorial:");
		  int x=sc.nextInt();
			factorial f1= new factorial();
		//	int x=8;
		int y= f1.facto(x);
		
		System.out.printf("The Factorial of%d=%d",x,y);
		//System.out.printf("the factorial of"+x+"is :",x,y);
		//System.out.prinf(" no is %d",x);
	}
	
}
