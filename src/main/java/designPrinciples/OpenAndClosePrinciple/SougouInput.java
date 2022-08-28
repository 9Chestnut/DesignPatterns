package designPrinciples.OpenAndClosePrinciple;

import lombok.Data;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月27日 17:50
 * @Description: 搜狗输入法
 */
@Data
public class SougouInput {

    /**
     * 聚合皮肤组件
     */
    private AbstractSkin skin;

    /**
     * 展示目前搜狗输入法配置的皮肤
     */
    public void display(){
        skin.display();
    }

}
