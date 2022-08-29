package creatorMode.builderMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:31
 * @Description: 抽象的建造者类
 */
public abstract class Builder {

    protected Bike bike = new Bike();
    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
