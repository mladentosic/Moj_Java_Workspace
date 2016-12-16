import java.io.Serializable;

public class Machine implements Serializable {
	
	private static final long serialVersionUID = 4801633306273802062L;
	private int id;
	private String name;
	private int status;
	private boolean working;
	
	public Machine(int id, String name, int status, boolean workinf) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.working = working;
	}

	@Override
	public String toString() {
		return "Masina [id=" + id + ", name=" + name + ", status=" + status + ", working=" + working + "]";
	}
	

}
