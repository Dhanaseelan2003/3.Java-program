import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan= new Scanner(System.in);
	    System.out.print("enter the array size:");
	    Integer n=scan.nextInt();
	    System.out.print("enter the array elements:");
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=scan.nextInt();
	    }
	    System.out.print("enter the difference:");
	    Integer diff=scan.nextInt();
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(Math.abs(arr[i]-arr[j])==diff)
	            count++;
	        }
	    }
	
	    System.out.println("No of pairs with differece "+diff+" is "+count);
	    
	}
}

OUTPUT:

enter the array size:7
enter the array elements:4 6 8 1 3 7 9
enter the difference:3
No of pairs with difference 3 is 4
