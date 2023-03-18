package timAssignment2;

public class Wrap implements TimsConsumables {
    @Override
    public int getCalories() {
        return 900;
    }

    @Override
    public String getName() {
        return "Wraps";
    }

    @Override
    public double getPrice() {
        return 7.89;
    }

    @Override
    public String toString() {
        return "Name :"+getName()+"\nCalories: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
