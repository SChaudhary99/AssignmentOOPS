public class Mugs implements TimsMerchandise {
    @Override
    public String getFeature() {
        return "Tim Hortons Mugs";
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
