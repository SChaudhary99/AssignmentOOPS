package timAssignment2;

public class Donut implements TimsConsumables {
    @Override
    public int getCalories() {
        return 370;
    }

    @Override
    public String getName() {
        return "Donut";
    }

    @Override
    public double getPrice() {
        return 2.59;
    }

    @Override
    public String toString() {
        return "Calories: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
