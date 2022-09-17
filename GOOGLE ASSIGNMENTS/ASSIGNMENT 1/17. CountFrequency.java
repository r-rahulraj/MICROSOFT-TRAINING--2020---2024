import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] freq=new int[26];
		String s=sc.next();
	
		for(int i=0;i<s.length();i++) {
		    char c=s.charAt(i);
		    freq[c-'a']++;
		}
		for(int i=0;i<freq.length;i++) {
		    if(freq[i] != 0) {
		        char c=(char)(i+'a');
		        System.out.println("Count of " + c + " : " + freq[i]);
		    }
		}
	}
}
