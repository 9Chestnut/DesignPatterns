package creatorMode.singletonMode.lazy;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 17:12
 * @Description: 懒汉式：线程不安全
 */
public class LazyNotThreadSafety {

    private  LazyNotThreadSafety(){};

    private static LazyNotThreadSafety INSTANCE;

    public LazyNotThreadSafety getInstance() {
        if (INSTANCE == null){
            INSTANCE = new LazyNotThreadSafety();
        }
        return INSTANCE;
    }
}
