/*
Given two sorted arrays A and B, generate all possible arrays such that first element is taken from A then from B then from A and 
so on in increasing order till the arrays exhausted. The generated arrays should end with an element from B.

Input Format
The First Line contains Two Integer N and M, as the size of both the Arrays. Next Line contains N Integers separated by space as Array A[]. 
Next Line contains M Integers separated by space as Array B[].

Constraints
Arrays A[] and B[] are Sorted.

Output Format
Display the Sorted Arrays generated separated by a new Line.

Sample Input
3 4
10 15 25
1 5 20 30
Sample Output
10 20
10 20 25 30
10 30
15 20
15 20 25 30
15 30
25 30
Explanation
For the Given Sample output test case 10 20 can be generated by choosing 10 from the A[] and 20 from the B[].
 */

package assignment7RecursionAndBacktrack;
import java.util.Scanner;
public class GenerateSortedArrays {

	void generateTemp(int A[], int B[], int C[], int i, int j, int m, int n,
            int ln, boolean flg)
    {
        if (flg) // Include valid element from A
        {
            // Print output if there is at least one 'B' in output array 'C'
            if (ln != 0)
                printArr(C, ln + 1);
 
            // Recursion for all elements of A after current index
            for (int k = i; k < m; k++)
            {
                if (ln == 0)
                {
                    C[ln] = A[k];
                    generateTemp(A, B, C, k + 1, j, m, n, ln, !flg);
                }
                 
                else if (A[k] > C[ln])
                {
                        C[ln + 1] = A[k];
                        generateTemp(A, B, C, k + 1, j, m, n, ln + 1, !flg);
                }
            }
        }
         
        else
        {
            for (int l = j; l < n; l++)
            {
                if (B[l] > C[ln])
                {
                    C[ln + 1] = B[l];
                    generateTemp(A, B, C, i, l + 1, m, n, ln + 1, !flg);
                }
            }
        }
    }
 
    void generateAns(int A[], int B[], int m, int n)
    {
        int C[] = new int[m + n];
      
        /* output array */
        generateTemp(A, B, C, 0, 0, m, n, 0, true);
    }
 
    void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        GenerateSortedArrays generate = new GenerateSortedArrays();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];
        for(int cnt=0; cnt<n;cnt++)
        	A[cnt]=sc.nextInt();
        for(int cnt=0; cnt<m;cnt++)
        	B[cnt]=sc.nextInt();
        
        generate.generateAns(A, B, n, m);
    }

}