import java.util.*;
class permutation{
   
static void swap(String s, String a)
{   
    if (s.length() == 0)
    {
        System.out.print(a + "  ");
        return ;
    }
      
    for(int i = 0 ;i < s.length(); i++)
    {
        char ch = s.charAt(i);
        String left_substr = s.substring(0, i);
        String right_substr = s.substring(i + 1);
        String rest = left_substr + right_substr;
        swap(rest, a+ ch);
    }
}
 
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);    
    String s1;
    String answer="";
      
    System.out.print(
    "Enter the string : ");
    s1 = scan.next();
      
    System.out.println(
    "All possible strings are : ");
    swap(s1,answer);
}
}