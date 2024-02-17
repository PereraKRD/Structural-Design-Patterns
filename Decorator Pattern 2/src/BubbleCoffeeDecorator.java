public class BubbleCoffeeDecorator extends CoffeeDecorator{

    public BubbleCoffeeDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void makeCoffee() {
        decoratedCoffee.makeCoffee();
        BubblesAdded();
    }

    public void BubblesAdded(){
        System.out.println("Bubbles Added");
    }
}
