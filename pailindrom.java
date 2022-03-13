import java.util.Scanner;

public class pailindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,temp,rev =0;
		System.out.println("enter a number:");
		n = sc.nextInt();
		temp = n;
		while(n>0) {
			rev = rev*10 + n%10;
			n=n/10;
		}
		
       if (rev == temp) { 
    	   System.out.println("it is pailindrom number:"+rev);
       }
       
       else 
    	   System.out.println("it is not a pailindrom number:"+temp);
       
	}

}
