package creatorMode.factoryMode.AbstractFactory;

import creatorMode.factoryMode.factoryMethod.AbstractCoffee;
import creatorMode.factoryMode.factoryMethod.AmericanCoffee;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 01:00
 * @Description: 美式风味的甜品工厂：生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public AbstractCoffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public AbstractDessert createDessert() {
        return new MatchMousse();
    }
}
