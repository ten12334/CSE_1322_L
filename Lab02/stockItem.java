package Lab02;

public class stockItem {
    String description;
    int myID, myQuantity;
    double myPrice;

    public stockItem () {
        description = "Nice!";
        myID = 1;
        myQuantity = 1;
        myPrice = 1.0f;
    }

    public stockItem (String desc, int id, int quant, double price) {
        description = desc;
        myID = id;
        myQuantity = quant;
        myPrice = price;
    }

    void addQuantity(int amount) { myQuantity += amount; }
    void removeQuantity(int amount) { myQuantity -= amount; }

    String getDescription() { return description; }
    void setDescription(String input) { description = input; }

    int getID() { return myID; }
    void setID(int input) { myID = input; }

    int getQuantity() { return myQuantity; }
    void setQuantity(int input) { myQuantity = input; }
    
    double getPrice() { return myPrice; }
    void setPrice(double input) { myPrice = input; }

    public String toString() {
        return "ID: " + myID + ", Description: " + description + ", Quantity: " + myQuantity + ", Price: " + myPrice;
    }
}