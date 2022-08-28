package creatorMode.factoryMode.AbstractFactory;

import creatorMode.factoryMode.factoryMethod.AbstractCoffee;
import creatorMode.factoryMode.factoryMethod.LatteCoffee;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 01:01
 * @Description: 意大利风味的甜品工厂：生产拿铁咖啡和提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public AbstractCoffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public AbstractDessert createDessert() {
        return new Trimisu();

    }
}
