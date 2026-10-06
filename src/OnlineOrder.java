public class OnlineOrder implements OrderProcessor {

    @Override
    public void process(Order order) {
        System.out.println("Processing online order: " + order);
    }
    

}
