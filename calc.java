import java.util.*;
public class calc {
	static int result;
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		System.out.println("enter your first number:");
		int f1 = first.nextInt();
		Scanner second = new Scanner(System.in);
		System.out.println("enter your second number:");
		int s1 = second.nextInt();
		System.out.println(calc.add(f1,s1));
		calc st = new calc();
		System.out.println(st.Substraction(f1, s1));
		calc ml = new calc();
		System.out.println(ml.Multplication(f1, s1));
		calc div = new calc();
		System.out.println(div.Dividation(f1,s1));
		System.out.println(div.Dividation(f1, s1));
	}
  public static int add(int a ,int b) {
	  System.out.println("your addition number is:");
	  return (a+b);
  }
  public  int Substraction(int a,int b) {
	  System.out.println("your substraction number is:");
	  return (a-b);
  }
  public  int Multplication(int a,int b) {
	  System.out.println("your mulplication is:");
	  return (a*b);
  }
  public boolean Dividation(int a,int b) {
	  System.out.println("your divide value is:");
	  try{
        int   result = a/b;
       System.out.println("The result is" +result);
       return true;

      } 
      catch (ArithmeticException e) {
//        System.out.println ("Can't be divided by Zero " + e);
    	return false;

      }
	  
	  
  }
}
