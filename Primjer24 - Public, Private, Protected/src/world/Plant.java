package world;
 
class Something {
     
}
 
public class Plant {
	
    // Primjer lose prakse
    public String name;
     
    // Prihvatljivo, posto je FINAL
    public final static int ID = 8;
     
    private String type;
     
    protected String size;
     
    int height;
     
    public Plant() {
        this.name = "Drvko";
        this.type = "biljka";
        this.size = "srednje velicine";
        this.height = 8;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}