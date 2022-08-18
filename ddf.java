package datepr;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ddf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//format year month date
		 LocalDate a = LocalDate.now();
	        System.out.println("yyyy-MM-dd Format     :    "+a);
// 	//format  date month year
	        LocalDateTime b = LocalDateTime.now();
	        DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String r = p.format(b);
	        System.out.println("dd/MM/yyyy format     :    "+r);
	      //format  date month_name year 
	        LocalDateTime c = LocalDateTime.now();
	        DateTimeFormatter p2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
	        String r2 = p2.format(c);
	        System.out.println("dd MMM yyyy format     :    "+r2);
	        
	        //format day date month_name year
	        LocalDateTime d = LocalDateTime.now();
	        DateTimeFormatter p3 = DateTimeFormatter.ofPattern("E dd MMM yyyy");
	        String r3 = p3.format(d);
	        System.out.println("E dd MMM yyyy format     :    "+r3);
	
	}
}