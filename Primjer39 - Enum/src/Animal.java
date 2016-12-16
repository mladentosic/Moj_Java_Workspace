
public enum Animal {
	CAT("Garfild"), DOG("Snupi"), MOUSE("Dzeri");
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ENUM konstruktori ne mogu biti PUBLIC, pa ce biti PRIVATE
	private Animal(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Ova zivotinja se zove: " + name;
	}
}
