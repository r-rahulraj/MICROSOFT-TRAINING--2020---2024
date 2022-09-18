import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=(n1*n2)/findGCD(n1,n2);
        System.out.print(lcm);
    }
    public static int findGCD(int m,int n) {
        if(m==0) return n;
        return findGCD(n%m,m);
    }
}
