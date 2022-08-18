package collections;

import java.util.ArrayList;

public class colltostringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a =new ArrayList<String>();
		
		a.add("Sunday");
		a.add("Monday" );
		a.add("Tuesday" );
		
		System.out.print("  arraylist "  +a);
		
		
		String [] p =a.toArray(new String [a.size()]);
System.out.print("\n  string");
		for(String val : p)
		{
			System.out.print("\n  "+val);
		}
				
	}

}
