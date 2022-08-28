package creatorMode.singletonMode.lazy;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 19:51
 * @Description: 懒汉式：静态内部类实现方式：线程安全
 *  在JVM加载外部类的过程中，是不会加载静态内部类的
 *  只有内部类的熟属性/方法被调用的时候才会被加载，并初始化其静态属性
 *  静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序
 */
public class LazyStaticInnerClass {

    private static boolean flag = false;

    private LazyStaticInnerClass() {
        // 防止反射破坏单例模式
        synchronized (LazyLockThreadSafety.class){
            if (flag){
                throw new RuntimeException("不能创建多个对象！");
            }
            flag = true;
        }
    };

    /**
     * 定义一个静态内部类
     */
    private static class LazyStaticInnerClassSingleton {
        //在内部类中声明并初始化外部类对象
        private static final LazyStaticInnerClass INSTANCE = new LazyStaticInnerClass();
    }

    public static LazyStaticInnerClass getInstance() {
        return LazyStaticInnerClassSingleton.INSTANCE;
    }

    /**
     * 防止反序列化破坏单例模式
     * @return
     */
    public Object readResolve() {
        return LazyStaticInnerClassSingleton.INSTANCE;
    }

}
