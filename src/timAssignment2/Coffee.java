package timAssignment2;

public class Coffee implements TimsConsumables {
    @Override
    public int getCalories() {
        return 90;
    }

    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 1.97;
    }

    @Override
    public String toString() {
        return "Calories: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
