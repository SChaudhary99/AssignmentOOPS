public class Coffee implements TimsConsumables{
    @Override
    public int getCalories() {
        return 90;
    }

    @Override
    public double getPrice() {
        return 1.97;
    }

    @Override
    public String toString() {
        return "Calores: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
