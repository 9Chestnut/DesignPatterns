package creatorMode.factoryMode.factoryMethod;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 00:36
 * @Description: 咖啡店
 */
public class CofferStore {

    private CoffeeFactory factory;

    public CofferStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public AbstractCoffee orderCoffer(String type){
        AbstractCoffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
