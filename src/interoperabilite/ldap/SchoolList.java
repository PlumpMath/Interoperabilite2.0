package interoperabilite.ldap;

import interoperabilite.json.JsonManager;

import java.util.ArrayList;

public class SchoolList {
	private ArrayList<School> schools;

	public ArrayList<School> getSchools() {
		return schools;
	}

	public void setSchools(ArrayList<School> schools) {
		this.schools = schools;
	}

	private SchoolList(){

	}

	/** Instance unique pr�-initialis�e */
	private static SchoolList INSTANCE = new SchoolList();

	/** Point d'acc�s pour l'instance unique du singleton */
	public static synchronized SchoolList getInstance(){
		if (INSTANCE == null) {
			ArrayList<School> schools = JsonManager.getInstance().<School>readFromFile("imieschools.json",".\\config\\imie\\",School.class);
			INSTANCE = new SchoolList();
			INSTANCE.setSchools(schools);
		}
		return INSTANCE;
	}
}
