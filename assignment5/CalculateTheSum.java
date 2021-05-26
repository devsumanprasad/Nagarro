package assignment5;

import java.util.*;

public class CalculateTheSum {

	public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int sum=0;
        int q=s.nextInt();
        int ac[]=new int[q];
        for(int i=0;i<q;i++)
            ac[i]=s.nextInt();
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        while(q-->0){
            sum*=2;
        }
        System.out.print((sum)%1000000007);
    }

}
