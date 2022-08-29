package creatorMode.builderMode.builderExtend;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:58
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
