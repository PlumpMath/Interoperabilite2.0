package interoperabilite.saisie;

import java.util.*;

public class InputScanner {

	public static void main(String[] args) {
	    
		Scanner scanner = null;
	    try {
	    	scanner = new Scanner(System.in);
	       
	    	// prompt
		    System.out.print("Enter something: ");
		    String str = scanner.next();

		    System.out.println(String.format("You typed: %s", str));
	    }
	    finally {
	        if(scanner!=null)
	            scanner.close();
	    }
	}

}
