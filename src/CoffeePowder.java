public class CoffeePowder implements TimsMerchandise {
    @Override
    public String getFeature() {
        return "Finley roasted and grounded signature coffee powder.";
    }

    @Override
    public double getPrice() {
        return 10.97;
    }

    @Override
    public String toString() {
        return "Feature: "+getFeature()+"\nPrice: "+getPrice()+"$";
    }
}
