class User {
     
    private int id;
    private String name;
     
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public String toString() {
         
        return String.format("%-4d: %s", id, name);
         
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
         
        return sb.toString();
        */
    }
}
 
public class App {
 
    public static void main(String[] args) {
        User user1 = new User(7, "Marko");
        User user2 = new User(5, "Goran");
         
        System.out.println(user1);
        System.out.println(user2);
    }
}