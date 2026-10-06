public class StoreOrder implements OrderProcessor {

    @Override
    public void process(Order order) {
        System.out.println("Processing store order: " + order);
    }

   
}
