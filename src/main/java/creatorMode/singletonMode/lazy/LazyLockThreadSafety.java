package creatorMode.singletonMode.lazy;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 19:45
 * @Description: 懒汉式：双重检测锁
 */
public class LazyLockThreadSafety {
    private  LazyLockThreadSafety(){
        // 防止反射破坏单例模式
        synchronized (LazyLockThreadSafety.class){
            if (INSTANCE != null){
                throw new RuntimeException("不能创建多个对象！");
            }
        }
    };

    private volatile static LazyLockThreadSafety INSTANCE;

    public LazyLockThreadSafety getInstance() {
        if (INSTANCE == null){
            synchronized (LazyLockThreadSafety.class){
                if (INSTANCE == null) {
                    INSTANCE = new LazyLockThreadSafety();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 防止反序列化破坏单例模式
     * @return
     */
    public Object readResolve() {
        return INSTANCE;
    }


}

