package creatorMode.factoryMode.AbstractFactory;

import creatorMode.factoryMode.factoryMethod.AbstractCoffee;

public interface DessertFactory {

    /**
     * 生产咖啡的功能
     * @return
     */
    AbstractCoffee createCoffee();

    /**
     * 生产甜品的功能
     * @return
     */
    AbstractDessert createDessert();
}
