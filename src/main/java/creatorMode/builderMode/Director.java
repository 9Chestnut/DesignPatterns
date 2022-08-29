package creatorMode.builderMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:40
 * @Description: 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
