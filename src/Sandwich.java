public class Sandwich implements TimsConsumables{
    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public double getPrice() {
        return 5.98;
    }

    @Override
    public String toString() {
        return "Calores: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
