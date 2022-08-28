package creatorMode.factoryMode.configFactory;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 01:25
 * @Description: 测试类
 */
public class Client {
    public static void main(String[] args) {
        AbstractCoffee latte = CoffeeFactory.createCoffee("american");
        System.out.println(latte.getName());
    }
}
