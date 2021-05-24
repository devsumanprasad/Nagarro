package nagarro;
import java.util.*;

public class PiyushAndCandy {

	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n=0;
			int t = sc.nextInt();
			while(t>0){
				n = sc.nextInt();
				int p = 2;
				int count = 0;
				int temp = 0;
				int flag = 0;
				while(count<n){
					if(p==2){
						
						p++;
						count++;
					}
					if(n==1) {
						System.out.println("2");
					}
					if(p>2 && count<n) {
						for(int i=2;i<p;i++){
							flag=0;
							if(p%i==0){
								p++;
								flag = 1;
								i=2;
								
							}
							
						}
						if(flag == 0){
							temp = p;
							p++;
							count++;
						}
					}
					
					
				}
				if(temp>0)
					System.out.println(temp);
				t--;

			}
	    }

}
