import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		if(s.equals(rev)) System.out.print("Palindrome!!");
		else System.out.print("Not a Palindrome!!");
	}
}
