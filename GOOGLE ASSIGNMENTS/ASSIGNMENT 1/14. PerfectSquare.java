import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(isPerfectSquare(n)) System.out.print("Perfect Square");
	    else System.out.print("Not a Perfect Square");
	}
	public static boolean isPerfectSquare(int n) {
	    if(n==1) return true;
	    for(int i=1;i<=n/2;i++) {
	        if(i*i==n) return true;
	    }
	    return false;
	}
}
