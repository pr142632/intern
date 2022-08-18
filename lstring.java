package string;

public class lstring {
	 public static int len(String p) {
	        p = p.trim();
	        int ab = p.lastIndexOf(" ")+1;
	        
	        return p.length() - ab;
	    }    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        	 System.out.print(len("javaprogram"));

	        	
	        	
	}

}
