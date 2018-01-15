/*
 * Sample Input 1:
5 
Sample Output1: 
SSSSS 
S**** 
SSSSS 
****S 
SSSSS
 
Sample Input 2:
7 
Sample Output2: 
SSSSSSS
S******
S******
SSSSSSS
******S
******S
SSSSSSS
 */
package patterns;
import java.util.*;
public class S_Pattern {
	    public static void main(String args[]){
	        int n;
	        Scanner s = new Scanner(System.in);
	        n = Integer.parseInt(s.nextLine());
	        int height = n;
	        int width = n;
	        int mid = (height+1)/2;
	        for(int i =1;i<=height;i++){
	            for(int j=1;j<=width;j++){
	                if(i == 1 || i == height || i == mid)
	                    System.out.print("S");
	                else if(i >= 2 && i < mid){
	                    if(j == 1)
	                        System.out.print("S");
	                    else 
	                        System.out.print("*");
	            }
	            else{
	                if(i > mid && i < height){
	                    if(j == width)
	                        System.out.print("S");
	                    else 
	                        System.out.print("*");
	                }
	            }
	        }
	        System.out.println();
	    }
	}
	
}
