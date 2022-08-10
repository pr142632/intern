package p28;
import java.util.Scanner;
enum Subjects2 {
    DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}

 
public class p28 {
	static void sub(Subjects2 s)
	{
	       switch(s){
	           case DBMS:
	               System.out.println("Database Management System by Mcc Graw Hill");
	               break;
	           case DSA:
	               System.out.println("Data Structures and Algorithms by Thomas H Cormen");
	               break;
	           case NETWORKING:
	               System.out.println("Networking by Technical");
	               break;
	           case OPERATING_SYSTEMS:
	               System.out.println("Operating system by Silberschatz, Galvin and Gagne");
	               break;
	       }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter Subject");
        Scanner sc=new Scanner(System.in);
        String subject=sc.next();
        
        sub(Subjects2.valueOf(subject));

	}

}
