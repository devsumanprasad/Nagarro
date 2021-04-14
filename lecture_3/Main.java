
/** program to find max and min of N numbers without array*/
package lecture_3;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	
	int n1 = scn.nextInt();
	int max = n1;
	int min = n1;
	int count = 1;
	while(count<a) {
		int n = scn.nextInt();
		if(n>max) {max=n;} else if(n<min){min=n;}
		count++;
	}
		
		// TODO Auto-generated method stub
		System.out.println("Hello max "+max+" Hi! min "+min);
	
	}

}
