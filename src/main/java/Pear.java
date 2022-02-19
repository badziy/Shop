public class Pear extends Product implements Food {
    private final String name = "Груши";
    private final int price = 200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Груши сЪедены");
    }
}