package datepr;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class atd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate p = LocalDate.of(2019, 1, 14);
	  LocalDateTime a = p.atTime(6, 00);
		System.out.print(" \n "+ a);
	}

}
