package collections;
import java.util.*;
public class arraytocoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a [] ={"mon","tue","wed","thu"};
		for(String valu: a)
		{
			System.out.print("\n" +valu);
		}
		
	List <String> z= Arrays.asList(a);
	System.out.print("\n converted into  Arraylist  "+ z);
		}

	

}
