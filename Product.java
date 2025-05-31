public class Product {
    private String productName;
    private String productID;
    private double price;
    private int stock;

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setProductID(String id) {
        this.productID = id;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void restock(int quantity) {
        stock += quantity;
    }

    public boolean purchase(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
