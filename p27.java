package p27;

public class p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enum sub {
		 
			DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
		}
		

		        sub[] p = sub.values();
		        for (sub subject : p){
		            System.out.println("Value of Enum "+subject.name());
		            System.out.println("Index Value of Enum "+subject.ordinal());
		        }
		    }
		}




