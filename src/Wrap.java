public class Wrap implements TimsConsumables{
    @Override
    public int getCalories() {
        return 900;
    }

    @Override
    public double getPrice() {
        return 7.89;
    }

    @Override
    public String toString() {
        return "Calores: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
