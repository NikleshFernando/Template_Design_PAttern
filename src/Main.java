// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Beverages beverage = null;
    public static void main(String[] args) {

        Beverages Tea = new Tea();
        Tea.prepareRecepie();

        System.out.println("==========================");

        Beverages Coffee = new Coffee();
        Coffee.prepareRecepie();


    }
}