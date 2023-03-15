public class Bagel implements TimsConsumables{
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public double getPrice() {
        return 4.39;
    }

    @Override
    public String toString() {
        return "Calores: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
