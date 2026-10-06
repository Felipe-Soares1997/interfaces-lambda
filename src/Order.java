public class Order {
    private String orderId;
    private String customerName;
    private String product;
    private int quantity;
    private double price;

    public Order(String orderId, String customerName, String product, int quantity, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
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

   
    @Override
    public String toString() {
        return "Order{" +
                "orderId = " + orderId + '\n' +
                "customerName = " + customerName + '\n' +
                "product = " + product + '\n' +
                "quantity = " + quantity + '\n' +
                "price = " + price +
                '}';
    }

}
