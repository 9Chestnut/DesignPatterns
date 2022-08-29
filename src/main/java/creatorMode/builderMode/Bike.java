package creatorMode.builderMode;

import lombok.Data;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 23:28
 * @Description: 具体的自行车产品类
 */
@Data
public class Bike {

    // 车架
    private Frame frame;

    // 车座
    private Seat seat;

}
