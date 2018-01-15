/*
 * Sample Input and Output1:
5 
DDDD* 
D***D 
D***D 
D***D 
DDDD*

Sample Input and Output2:
7
DDDDDD*
D*****D
D*****D
D*****D
D*****D
D*****D
DDDDDD*
 */
package patterns;
import java.util.*;
public class D_Pattern {
	    public static void main(String args[]){
	        int n;
	        Scanner s = new Scanner(System.in);
	        n = Integer.parseInt(s.nextLine());
	        for(int i = 1;i<=n;i++){
	            for(int j = 1;j<=n;j++){
	                if((i == 1 || i == n) && (j != n))
	                    System.out.print("D");
	                else if((i >=2 && i<n) && (j ==1 || j==n ))
	                    System.out.print("D");
	                else 
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	    }
	
}
