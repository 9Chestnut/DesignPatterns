package creatorMode.singletonMode.hungry;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月28日 20:00
 * @Description: 饿汉式：枚举实现方式
 * 因为枚举是线程安全的，并且只会被加载一次
 * 枚举类型是所有单例实现中唯一一种不会被破坏的单例实现模式
 */
public enum HungryEnum {
    INSTANCE;
}
