public class Coffee extends Beverages{

    @Override
    public void addCondiments() {
        System.out.println("Add Suger and Milk");
    }

    @Override
    public void brew() {
        System.out.println("Stripping coffe through the filter");
    }
}
