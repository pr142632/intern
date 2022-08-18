package datepr;
import java.text.DateFormat;
import java.util.*;
public class dtcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();



	       String a = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH).format(date);
	        System.out.println("french    : "+a);



	       String b = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA).format(date);
	        System.out.println("china    : "+b);



	       String c = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN).format(date);
	        System.out.println("german    : "+c);



	       String d = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY).format(date);
	        System.out.println("italy    : "+d);



	       String e = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA).format(date);
	        System.out.println("korea    : "+e);



	       String f = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK).format(date);
	        System.out.println("uk    : "+f);



	       String g = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(date);
	        System.out.println("us    : "+g);
	}

}
