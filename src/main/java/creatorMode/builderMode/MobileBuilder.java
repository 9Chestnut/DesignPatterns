package creatorMode.builderMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:32
 * @Description: 摩拜单车的具体建造者类
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        Frame frame = new Frame();
        frame.setFrameName("碳纤维车架");
        bike.setFrame(frame);
    }

    @Override
    public void buildSeat() {
        Seat seat = new Seat();
        seat.setSeatName("真皮车座");
        bike.setSeat(seat);
    }

    @Override
    public Bike createBike() {
      return bike;
    }


}
