import java.sql.SQLOutput;

public class Tea extends Beverages{

    @Override
    public void addCondiments() {

        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the Tea");

    }
}
