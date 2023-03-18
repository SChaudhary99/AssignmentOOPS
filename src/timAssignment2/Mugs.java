package timAssignment2;

public class Mugs implements TimsMerchandise {
    @Override
    public String getFeature() {
        return "Tim Hortons Mugs";
    }

    @Override
    public String getName() {
        return "Mug";
    }

    @Override
    public double getPrice() {
        return 12.59;
    }

    @Override
    public String toString() {
        return "Feature: "+getFeature()+"\nPrice: "+getPrice()+ "$";
    }
}
