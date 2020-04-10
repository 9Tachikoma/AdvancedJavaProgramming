public class Customer {
    private boolean hasBeenServed;
    private String name;

    public Customer(String name) {
        hasBeenServed = false;
        this.name = name;
    }

    public void serve() {
        hasBeenServed = true;
        System.out.println(name + "has been served");
    }

    @Override
    public String toString() {
        return name;//this is so that when I add customers to a queue and then print the queue it will show me the customers
    }
}
