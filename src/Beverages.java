public abstract class Beverages {

    final void prepareRecepie(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();

    }
    public abstract void addCondiments();

    public abstract void brew();

    public void boilWater(){
        System.out.println("Boiling Water");
    }
    public void pourInCup(){
        System.out.println("pour into cup");
    }
}
