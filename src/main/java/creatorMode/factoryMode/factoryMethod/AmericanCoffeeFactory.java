package creatorMode.factoryMode.factoryMethod;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 00:35
 * @Description: 美式咖啡工厂具体类
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public AbstractCoffee createCoffee() {
        return new AmericanCoffee();
    }
}
