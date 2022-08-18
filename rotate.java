package collections;

import java.util.*;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList <String> a =new ArrayList<String>();
		a.add("jan");
		a.add("feb");
		a.add("mar");
		a.add("apr");
		System.out.print("\n before rotate"+a);
	 Collections.rotate(a, 2);
	System.out.print("\n  after rotate "+a);
	
		
	}

}
