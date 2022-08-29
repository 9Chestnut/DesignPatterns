package creatorMode.prototypeMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:49
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型对象
        Realizetype realizetype = new Realizetype();

        // 调用原型类对象Realizetype中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();

        System.out.println(realizetype == clone);
    }
}
