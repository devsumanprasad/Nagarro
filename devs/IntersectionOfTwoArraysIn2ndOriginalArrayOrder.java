package nagarro;

import java.util.*;

public class IntersectionOfTwoArraysIn2ndOriginalArrayOrder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[m];
		for(int i=0;i<n;i++)
			arr1[i]=s.nextInt();
		for(int i=0;i<m;i++)
			arr2[i]=s.nextInt();
        int[] arrtemp2 = new int[m];
        for(int i=0;i<m;i++) arrtemp2[i]=arr2[i];
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans = intersect(arr1, arr2);
        for(int i=0;i<arrtemp2.length;i++)
        {
            if(ans.contains(arrtemp2[i])){
                System.out.print(arrtemp2[i]+" ");
                ans.remove(ans.indexOf(arrtemp2[i]));
            }
            
            
        }
		
	
	}
	
	public static ArrayList<Integer> intersect(int [] arr1, int [] arr2){
		int i=0,j=0;
		int temp [] = new int[arr2.length];
		for(int k=0;k<temp.length;k++)
			temp[k]=arr2[k];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> ans = new ArrayList<>();
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]==arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
			
		}
		
		
		return ans;
	}

}
