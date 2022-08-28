package creatorMode.factoryMode.configFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 01:18
 * @Description:
 */
public class CoffeeFactory {

    private static Map<String,AbstractCoffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);
            // 遍历properties集合对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                // 根据键获取值（全类名）
                String className = properties.getProperty((String) key);
                // 获取字节码对象
                Class<?> aClass = Class.forName(className);
                AbstractCoffee obj = (AbstractCoffee) aClass.newInstance();
                map.put((String) key, obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AbstractCoffee createCoffee(String name) {
        return map.get(name);
    }
}
