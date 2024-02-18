import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the size of array A:");
        int n=scan.nextInt();
        int[] A=new int[n];

        System.out.println("Enter the elements for array A:");
        for(int i=0;i<n;i++) 
        {
            A[i]=scan.nextInt();
        }

        System.out.println("Enter the size of array B:");
        int n1=scan.nextInt();
        int[] B=new int[n1];

        System.out.println("Enter the elements for array B:");
        for(int i=0;i<n1;i++) 
        {
            B[i]=scan.nextInt();
        }

        int[] C=new int[n1];
        int a=0,b=0;

        for(int i=0;i<n;i++) 
        {
            a=a*10+A[i];
        }

        for(int i=0;i<n1;i++) 
        {
            b=b*10+B[i];
        }

        int temp,temp1,add;
        temp=(int)Math.pow(10, n)-1;
        temp1=temp-b;
        add=temp1+a;
        int carry;

        if(add>n) 
        {
            carry=add/((int)Math.pow(10,n));
            int res=add-((int)Math.pow(10,n))+carry;
            System.out.println(res);
        }
    }
}

output:

Enter the size of array A:
5
Enter the elements for array A:
1 2 1 5 3
Enter the size of array B:
4
Enter the elements for array B:
5 8 7 9
6274
