package creatorMode.singletonMode.hungry;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 16:25
 * @Description: 饿汉式单例：静态成员变量实现
 */
public class HungryByStaticMemberVariable {

    /**
     * 1.私有构造方法
     */
    private HungryByStaticMemberVariable() {};

    /**
     * 2.在本类中创建本类对象
     */
    private static HungryByStaticMemberVariable INSTANCE = new HungryByStaticMemberVariable();

    /**
     * 3.提供一个公共的访问方式，让外界获取对象
     * @return
     */
    public static HungryByStaticMemberVariable getInstance() {
        return INSTANCE;
    }

}
