import java.util.ArrayList;

class Inserts {
    int id;
    String username;
    double price;
    int quanitity;
    String type;
    long timestamp;

    Inserts(int id, String username, double price, int quanitity, String type, long timestamp){
        this.id = id;
        this.username = username;
        this.price = price;
        this.quanitity = quanitity;
        this.type = type;
        this.timestamp = timestamp;
    }
     void display() {
        System.out.println("ID: " + id);
        System.out.println("User: " + username);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quanitity);
        System.out.println("Type: " + type);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("----------------------");
    }

}

public class Order {
    public static void main(String[] args) {
        ArrayList<Inserts> List = new ArrayList<>();
        List.add(new Inserts(1, "gaurav", 50.50, 4, "Buy", System.currentTimeMillis()));
        List.add(new Inserts(2, "saurabh", 50.50, 4, "Buy", System.currentTimeMillis()));
        List.add(new Inserts(3, "vikki", 50.50, 4, "Buy", System.currentTimeMillis()));

          for (Inserts insert : List) {
            insert.display();
        }
    }
}