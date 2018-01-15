/*
 * Sample Input 1:
DHONI
Sample Output1:

^^^^D^^^^ 
^^^H^H^^^ 
^^O^^^O^^ 
^N^^^^^N^ 
I^^^^^^^I

Sample Input 2:
SACHIN 
Sample Output 2: 
^^^^^S^^^^^
^^^^A^A^^^^
^^^C^^^C^^^
^^H^^^^^H^^
^I^^^^^^^I^
N^^^^^^^^^N
 */

package patterns;
import java.util.*;
public class Pattern_7 {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        int n = str.length();
	        int mid = (2*n)/2;
	        int k =0;
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++){
	                System.out.print("^");
	            }
	            while(k != (2*i)-1){
	                if(k==0 || k==2*i-2)
	                    System.out.print(str.charAt(i-1));
	                else
	                    System.out.print("^");
	                    k++;
	                    ;
	            }
	            for(int j = 2*n-1;j>=mid+i;j--)
	                System.out.print("^");
	        
	        k = 0;
	        System.out.println();
	    }
	}
	
}
