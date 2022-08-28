package creatorMode.singletonMode.hungry;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 16:57
 * @Description: 饿汉式：静态代码块实现
 */
public class HungryByStaticCodeBlock {

    /**
     * 私有构造方法
     */
    private HungryByStaticCodeBlock() {};

    /**
     * 在本类中创建本类对象
     */
    private static HungryByStaticCodeBlock INSTANCE;

    // 在静态代码块中进行赋值
    static {
        INSTANCE = new HungryByStaticCodeBlock();
    }

    /**
     * 提供一个公共的访问方式，让外界获取对象
     * @return
     */
    public static HungryByStaticCodeBlock getInstance() {
        return INSTANCE;
    }

}
