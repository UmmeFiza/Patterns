/*
 * Sample Input 1:
5 
Sample Output1: 
7.7.7.7.7 
.......7. 
......7.. 
.....7... 
....7....
 
Sample Input 2:
3 
Sample Output 2: 
7.7.7
...7.
..7..

 */

package patterns;
import java.util.*;
public class Pattern_6 {
	public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int width = 2*n-1;
        for(int i=1;i<=n;i++){
            for(int j = 1; j<= width;j++){
                if(i ==1 ){
                    if((i+j)%2 == 0)
                        System.out.print("7");
                    else 
                        System.out.print(".");
                }
                else if(i>1 && j == width-i+1)
                    System.out.print("7");
                else 
                    System.out.print(".");
            }
            System.out.println();
        }
	}
}
