package interoperabilite.saisie;

import java.util.*;

import interoperabilite.json.JsonManager;

public class InputScanner {

	public static void main(String[] args) {
		
		ArrayList<String> choices = JsonManager.getInstance()
				.<String>readFromFile("choices.json","./json/", String.class);
		for (String choice : choices) {
			if(choice != "{" && choice != "}" && !choice.matches("[-+]?\\d*\\.?\\d+")) {
				System.out.println(choice);
			}
		}
		System.out.print("\n");
		
	    
		Scanner scanner = null;
	    try {
	    	scanner = new Scanner(System.in);
	       
	    	// prompt
		    System.out.print("Select an action: ");
		    String str = scanner.next();

		    System.out.println(String.format("Action selected: %s", str));
	    }
	    finally {
	        if(scanner!=null)
	            scanner.close();
	    }
	}

}
