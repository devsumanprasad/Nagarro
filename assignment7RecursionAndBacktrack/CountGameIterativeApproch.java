//pending

package assignment7RecursionAndBacktrack;
import java.util.*;
public class CountGameIterativeApproch {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//countGame(arr, k);
		//System.out.println(count);
		System.out.println(countGameAlternative(arr,k));

	}
	static int countGame(int arr[], int k) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<=k) {
				count++;
			}
			else if(arr[i]>k) {
				arr[i]=arr[i]-k;
				count++;
				--i;
			}
		}
		return count;
	}
	
	static int countGameAlternative(int arr[], int k) {
		int cnt=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%k==0)
				cnt+=arr[i]/k;
			else
				cnt+=(arr[i]/k)+1;
		}
		return cnt;
	}

}
