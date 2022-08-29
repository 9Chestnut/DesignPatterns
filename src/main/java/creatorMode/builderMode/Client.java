package creatorMode.builderMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:41
 * @Description: 测试类
 */
public class Client {
    public static void main(String[] args) {
        Director ofoBuilder = new Director(new Ofobuilder());
        Bike ofoBike = ofoBuilder.construct();
        System.out.println(ofoBike.getFrame());

        Director mobileBuilder = new Director(new MobileBuilder());
        Bike mobileBike = mobileBuilder.construct();
        System.out.println(mobileBike.getFrame());
    }
}
