import java.util.*;
public class wordoccerance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//taking input
		System.out.println("enter your string:");
		String str = sc.nextLine();//assign value to a variable
		wordoccerance  f = new wordoccerance();
		str = str.toLowerCase();
		String [] word = str.split(" ");
		System.out.print(word);
		f.occerance(word);
		

	}
	public static void occerance(String[] words) {
		int freq = 1;
		String ch = "-";
		for (int i=0; i<words.length; i++) {
			for (int j = i+1; j<words.length; j++) {
				if(words[i].equals(words[j]))
				{
					freq++;
					words[j] = ch;
				}
			}
			if(words[i]!=ch) {
				System.out.println(words[i]+ " occured "+freq+"time");
				freq=1;
			}
		}
	}
		
	

}
