import java.util.Scanner;

public class frequencycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str = sc.nextLine();
		Occurence(str);
		

	}


public static void Occurence(String str) {
	str = str.toLowerCase();
	for(char ch = 'a'; ch<='z'; ch++) {
//		System.out.println(ch);
		int count = 0;
		for(int i=0; i<str.length(); i++) 
		{
			if (ch == str.charAt(i)) {
				count++;
			
			System.out.println(ch + ":occurence = "+ count);
			}
		}
	}
	
}

}