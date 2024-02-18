import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan= new Scanner(System.in);
	    System.out.print("enter the first String:");
	    String str1=scan.nextLine();
	    
	    System.out.print("enter the second String:");
	    String str2=scan.nextLine();
	    
	    if(str1.charAt(str1.length()-1)==str2.charAt(0))
	    {
	        System.out.println(str1.substring(0,str1.length()-1)+str2.substring(1));
	    }
	
	    
	    
	}
}


output:

enter the first String:bat
enter the second String:tree
baree
