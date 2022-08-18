package arry;
import java.util.*;

public class duplicate {
	 public static int abc(int[] b) {
	        int c = -1;
	        Arrays.sort(b);
	        int i = 0;
	        while(i < b.length) {
	            if( i+1 < b.length && b[i] == b[i+1]) {
	                c = b[i];
	                
	                break;
	                
	            }
	            i++;
	        }
	        return c;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1,2,2,3,4 };
		System.out.print("element");
		for(int val : x)
		{
			System.out.print("\t "+val );
		}
        System.out.println("\n duplicate element " +abc(x));
		
	}

}
