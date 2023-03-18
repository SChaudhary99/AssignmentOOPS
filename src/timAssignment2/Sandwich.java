package timAssignment2;

public class Sandwich implements TimsConsumables {
    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public String getName() {
        return "Sandwich";
    }

    @Override
    public double getPrice() {
        return 5.98;
    }

    @Override
    public String toString() {
        return "Name :"+getName()+"\nCalories: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
