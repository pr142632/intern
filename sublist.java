package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> a= new ArrayList <>();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
System.out.print( "\n list element for indexof source  "+a);
		
		List <Integer> p= new ArrayList <>();
	
		p.add(40);
		p.add(50);
		
		System.out.print("\n list element for indexof target "+p);
		
				int x =  Collections.indexOfSubList(a, p);
				System.out.print("\n index "+x);
				if(x==-1)
				{
					System.out.print(" \n element not present");
					
				}
				else

				{
					System.out.print(" \n  element  present");
				}

				List <String> r= new ArrayList <>();
				List <String> y= new ArrayList <>();
							r.add("a");
							r.add("b");
							r.add("c");
							r.add("d");
							y.add("a");
							y.add("b");
							System.out.print("\n list element for  lastIndexOfSubList source"+r);
							System.out.print("\n list element for  lastIndexOfSubList target"+y);	
				int t = Collections.lastIndexOfSubList(r,y);
			
				System.out.print("\n index "+t);
				if(t==-1)
				{
					System.out.print(" \n element not present");
					
				}
				else

				{
					System.out.print(" \n  element  present");
				}
	}

}
