/*
 * Sample Input 1:
9 
Sample Output1: 
MMMMMMMMM
*I*D*D*N*
**I***N**
*D*I*N*D*
D***I***D
*D*N*I*D*
**N***I**
*N*D*D*I*
SSSSSSSSS

Sample Input 2:
11 
Sample Output2: 
MMMMMMMMMMM
*I**D*D**N*
**ID***DN**
**DI***ND**
*D**I*N**D*
D****I****D
*D**N*I**D*
**DN***ID**
**ND***DI**
*N**D*D**I*
SSSSSSSSSSS 
 */
package patterns;
import java.util.*;
public class Pattern_8 {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.next());
	        int i,j=0,k,N = n-1,I =2,D1 = n/2,D2 = n-(n/2)+1;
	        for(i=0;i<n;i++)
	            System.out.print("M");
	        System.out.println();
	        for(j = 1;j<n-1;j++){
	            for(k=1;k<=n;k++){
	                if(k == I)
	                     System.out.print("I");
	                else if(k == N)
	                     System.out.print("N");
	                else if(k == D1 || k==D2)
	                     System.out.print("D");
	                else 
	                    System.out.print("*");
	            }
	            System.out.println();
	            if(j <n/2){
	                D1--;
	                D2++;
	            }
	            else if(j>=n/2){
	                D1++;
	                D2--;
	            }
	            I++;
	            N--;
	        }
	        for(i=0;i<n;i++)
	            System.out.print("S"); 
	    }
	
}
