package creatorMode.prototypeMode.shallowCloneDemo;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:55
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建具体的原型对象
        Citation citation = new Citation();
        // 克隆奖状对象
        Citation clone = citation.clone();

        citation.setName("张三");

        clone.setName("李四");

        citation.show();

        clone.show();
    }
}
