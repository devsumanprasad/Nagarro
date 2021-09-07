//Recursive Approch O(n^2)

package assignment7RecursionAndBacktrack;
import java.util.*;
public class CountGame {
	static int cnt=0;
	static int i=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sz = sc.nextInt();
		// TODO Auto-generated method stub
		int arr [] = new int[sz];
		int threshold = sc.nextInt();
		for(int it=0; it<arr.length;it++)
			arr[it]=sc.nextInt();
		int ans = count_game(arr, threshold);
		System.out.println(ans);

	}
	
	static int count_game(int[] arr, int threshold) {
		
		if(i==arr.length) {
			cnt++;
			return cnt;
		}
		//if(arr[i]<=3)
			//cnt++;
		while(arr[i]>threshold) {
			
			int temp = arr[i]%threshold;
			arr[i]=arr[i]-threshold-temp;
			cnt++;
			if(temp>0) {
				cnt++;
				temp=0;
			}
				
		}
		
		if(i!=arr.length-1) 
			cnt++;
		i++;
		count_game(arr,threshold);
		return cnt;
	}

}
