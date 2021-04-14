package lecture_4;

import java.util.*;
import java.lang.*;
public class Main_Prime {
    
    public static void main(String args[]) {
        // Your Code Here
        
        int count = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n;i++){
            int div=2;
            if (i == 1 || i == 0)
                continue;
            count = 1;
            for(;div<=Math.sqrt(i);div++){
                if(i%div==0){
                    count=0;
                    break;
                }
                    
            }
            if(count==1){
                System.out.println(i);
            }

        }
    }
}
