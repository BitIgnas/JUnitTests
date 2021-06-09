package example3;

public class Box {

    private String name;
    private int weight;
    private double price;

    public Box(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Box() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
