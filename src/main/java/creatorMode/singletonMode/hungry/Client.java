package creatorMode.singletonMode.hungry;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 16:33
 * @Description: 测试类
 */
public class Client {
    public static void main(String[] args) {

        // 静态变量方式
        HungryByStaticMemberVariable instance1 = HungryByStaticMemberVariable.getInstance();
        HungryByStaticMemberVariable instance2 = HungryByStaticMemberVariable.getInstance();
        System.out.println(instance1 == instance2);


        // 静态代码块
        HungryByStaticCodeBlock instance = HungryByStaticCodeBlock.getInstance();
        System.out.println(instance);


        HungryEnum instance3 = HungryEnum.INSTANCE;
        HungryEnum instance4 = HungryEnum.INSTANCE;
        System.out.println(instance3 == instance4);

    }
}
