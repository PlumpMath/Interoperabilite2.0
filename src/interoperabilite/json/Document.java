package interoperabilite.json;

public class Document{
	private Integer id;
	private String name;
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Document() {

	}

	public Document(Integer id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		String result = "";
		result += "  " + this.id + "\n";
		result += "  " + this.name + "\n";
		result += "  " + this.url + "\n";
		return result;
	}
}
