class Frog {
    private String name;
    private int age;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
class Zaba extends Frog {
	private String boja;
	
	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getBoja() {
		return boja;
	}

    public void kreketanje() {
    	System.out.println("KreKreKreeeee");
    }

}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
         
        frog1.setName("Zabac");
        frog1.setAge(1);
         
        System.out.println(frog1.getName());

        Zaba zaba1 = new Zaba();
       /* zaba1.setName("Kermit");
        zaba1.setAge(5);*/
        zaba1.setBoja("zelena");

        zaba1.setInfo("Kermit", 5);
        zaba1.kreketanje();

    }
    
 
}