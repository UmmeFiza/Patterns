/*
 * Sample Input 1:

5
Sample Output 1:

M*****M
M*M*M*M
M**M**M
M*****M
M*****M

Sample input 2:
7 
Sample output 2: 
M*******M
M*M***M*M
M**M*M**M
M***M***M
M*******M
M*******M
M*******M
*/

package patterns;

import java.util.*;
public class M_pattern {
	    public static void main(String args[]){
	        int n;
	        Scanner s = new Scanner(System.in);
	        n = Integer.parseInt(s.nextLine());
	        int height = n;
	        int width = n+2;
	        for(int i = 1;i<= height;i++){
	            for(int j=1;j<= width;j++){
	                if(j==1 || j==width)
	                    System.out.print("M");
	                else if( i>=2 && ((j == (i +1) || j == width -i) && i <= (height+1)/2))
	                    System.out.print("M");
	            
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	
}
