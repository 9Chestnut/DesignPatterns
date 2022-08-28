package creatorMode.factoryMode.factoryMethod;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 00:09
 * @Description: 咖啡抽象类
 */
public abstract class AbstractCoffee {

    /**
     * 获取coffee的名字
     * @return
     */
    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }

    public void addsugar(){
        System.out.println("加糖");
    }

}
