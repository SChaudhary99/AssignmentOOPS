public class GiftCards implements TimsMerchandise {
    @Override
    public String getFeature() {
        return "Provide a 30 dollars gift card to loved-one's";
    }

    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public String toString() {
        return "Feature: "+getFeature()+"\nPrice: "+getPrice()+"$";
    }
}
