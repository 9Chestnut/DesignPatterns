package creatorMode.builderMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:38
 * @Description: ofo单车的具体建造者类
 */
public class Ofobuilder extends Builder{
    @Override
    public void buildFrame() {
        Frame frame = new Frame();
        frame.setFrameName("铝合金车架");
        bike.setFrame(frame);
    }

    @Override
    public void buildSeat() {
        Seat seat = new Seat();
        seat.setSeatName("橡胶车座");
        bike.setSeat(seat);
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
