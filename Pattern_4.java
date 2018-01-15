/*
 * Sample Input 1:
DHONI 
Sample Output 1: 
DHONI 
H***H 
O***O 
N***H 
INOHD
Sample Input 2:
SACHIN 
Sample Output 2: 
SACHIN
A****I
C****H
H****C
I****A
NIHCAS
 */
package patterns;
import java.util.*;
public class Pattern_4 {
	
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        int n = str.length();
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(i == 0 || j == 0){
	                    int val = i+j;
	                    System.out.print(str.charAt(val));
	                }
	                else if(j == n-1){
	                    int val = (i+j)-2*i;
	                    System.out.print(str.charAt(val));
	                }
	                else if(i == n-1){
	                    int val =(i+j)-2*j;
	                    System.out.print(str.charAt(val));
	                }
	                else 
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	
}
