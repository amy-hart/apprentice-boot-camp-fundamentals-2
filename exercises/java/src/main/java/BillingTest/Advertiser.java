package BillingTest;

public class Advertiser {

    private String name;
    private AdvertiserType type;
    private int numberOfAdverts;
    private int numberOfProducts;

    public Advertiser(String name, AdvertiserType type, int numberOfAdverts, int numberOfProducts) {
        this.name = name;
        this.type = type;
        this.numberOfAdverts = numberOfAdverts;
        this.numberOfProducts = numberOfProducts;
    }

    public String getName() {
        return name;
    }

    public AdvertiserType getType() {
        return type;
    }

    public int getNumberOfAdverts() {
        return numberOfAdverts;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }
}


