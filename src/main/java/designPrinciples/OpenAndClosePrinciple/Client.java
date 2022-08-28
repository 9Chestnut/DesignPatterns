package designPrinciples.OpenAndClosePrinciple;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月27日 17:54
 * @Description: 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SougouInput sougouInput = new SougouInput();
        // 2.创建皮肤对象，只需要创建不同的皮肤对象即可，即使要增加新的皮肤，只需要扩展新的皮肤类
        DefaultSkin defaultSkin = new DefaultSkin();
        // 3.将皮肤设置到搜狗输入法中
        sougouInput.setSkin(defaultSkin);
        // 4.展示皮肤
        sougouInput.display();
    }
}
