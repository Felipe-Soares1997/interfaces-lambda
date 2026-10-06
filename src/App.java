public class App {
    public static void main(String[] args) throws Exception {
        Order storeOrder = new Order("001", "Felipe Soares", "caneta", 1, 2.50);
        Order onlineOrder = new Order("002", "Rosana Dark", "livro", 2, 150.00);
        DiscountProduct discount10 = price -> price * 0.9;
        DiscountProduct discount20 = price -> price * 0.8;  
        System.out.println("Discounted price for store order: " + discount10.applyDiscount(storeOrder.getPrice()));
        System.out.println("Discounted price for online order: " + discount20.applyDiscount(onlineOrder.getPrice()));
        
        OrderProcessor storeOrderProcessor = new StoreOrder();
        OrderProcessor onlineOrderProcessor = new OnlineOrder();
        storeOrderProcessor.process(storeOrder);
        onlineOrderProcessor.process(onlineOrder);
    }
}
