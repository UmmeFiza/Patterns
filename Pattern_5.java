/*Sample Input 1:
INDIA 
Sample Output1: 
I
IN
IND
INDI
INDIA
 
Sample Input 2:
DHONI 
Sample Output2: 
D
DH
DHO
DHON
DHONI
*/

package patterns;
import java.util.*;
public class Pattern_5 {
	public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        int n = str.length();
	        for(int i = 0;i < n;i++){
	            for(int j = 0;j<=i;j++){
	                System.out.print(str.charAt(j));
	            }
	            System.out.println();
	        }
	    }
	
}
