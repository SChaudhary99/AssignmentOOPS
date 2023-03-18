package timAssignment2;

public class HockeyCards implements TimsMerchandise {
    @Override
    public String getFeature() {
        return "Hockey card";
    }

    @Override
    public String getName() {
        return "Hockey Card";
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String toString() {
        return "Feature: "+getFeature()+"\nPrice: "+getPrice()+"$";
    }
}
