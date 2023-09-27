package Lab_2;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static int counter = 0;

    private Date mfcdate;

    Product(String name, double price, int quantity, Date mfcdate) {
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mfcdate=mfcdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Date getMfcdate() {
        return mfcdate;
    }

    public void setMfcdate(Date mfcdate) {
        this.mfcdate = mfcdate;
    }

    public String toString() {
        String productDetails = String.format("%04d\t%-20s%,.2f\t%d\t %s", id, name, price, quantity,mfcdate);
        return productDetails;
    }
    public Product isLatest(Product p1, Product p2){
       Date temp= mfcdate.isRecent(p1.mfcdate,p2.mfcdate);
       return temp==p1.mfcdate?p1:p2;
    }
}