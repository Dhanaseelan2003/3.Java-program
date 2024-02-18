import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Integer n= scan.nextInt();
		Integer sum=0;
		while(n>0)
		{
		    int temp=n%10;
		    n=n/10;
		    sum=sum+temp;
		}
		System.out.println(sum);
	}
}

output:
114
6
