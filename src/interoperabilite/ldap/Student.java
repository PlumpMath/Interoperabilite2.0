package interoperabilite.ldap;

public class Student  extends User{
	private Promotion promotion;
	
	public Student(Promotion promotion) {
		this.promotion = promotion;
	}
	
	public Student() {
		super();
	}
	
	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
}