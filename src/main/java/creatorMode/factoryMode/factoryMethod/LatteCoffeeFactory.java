package creatorMode.factoryMode.factoryMethod;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 00:34
 * @Description: 拿铁咖啡工厂具体类
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public AbstractCoffee createCoffee() {
        return new LatteCoffee();
    }
}
