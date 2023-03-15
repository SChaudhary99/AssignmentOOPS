public class Donut implements TimsConsumables{
    @Override
    public int getCalories() {
        return 370;
    }

    @Override
    public double getPrice() {
        return 2.59;
    }

    @Override
    public String toString() {
        return "Calores: "+getCalories()+"\nPrice: "+getPrice()+"$";
    }
}
