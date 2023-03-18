package timAssignment2;

public class Bagel implements TimsConsumables {
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public String getName() {
        return "Mugs";
    }

    @Override
    public double getPrice() {
        return 4.39;
    }

    @Override
    public String toString() {
        return "Name :"+getName()+"\nCalories: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
