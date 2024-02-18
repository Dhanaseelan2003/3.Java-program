import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
        {
            arr[i]=scan.nextInt();
        }

        Arrays.sort(arr);
        int min=arr[0]*arr[1]*arr[2];
        int min1=0;
        int min2=1;
        int min3=2;

        for(int i=0;i<=n-2;i++) 
        {
            for(int j=i+1;j<n-1;j++) 
            {
                int pro=arr[i]*arr[j]*arr[j+1];
                if(pro<min) {
                    min=pro;
                    min1=i;
                    min2=j;
                    min3=j+1;
                }
            }
        }

        System.out.println("Minimum product of 3 elements: "+min);
        System.out.println("Elements: "+arr[min1]+" "+arr[min2]+" "+arr[min3]);
    }
}

output:

Enter the array size: 
5
1 2 -4 -9 5
Minimum product of 3 elements: -90
Elements: -9 2 5
  
