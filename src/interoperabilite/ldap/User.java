package interoperabilite.ldap;

public class User {
	private int id;
	private String firstname;
	private String lastname;
	private String login;
	private String password;
	private byte[] guid;
	private Promotion promotion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getGuid() {
		return guid;
	}

	public void setGuid(byte[] guid) {
		this.guid = guid;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public User(int id, String firstname, String lastname, String login,
			String password, byte[] guid, Promotion promotion) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
		this.guid = guid;
		this.promotion = promotion;
	}

	public User() {
		super();
	}
}
