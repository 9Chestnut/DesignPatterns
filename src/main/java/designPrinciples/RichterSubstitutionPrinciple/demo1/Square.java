package designPrinciples.RichterSubstitutionPrinciple.demo1;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月27日 18:17
 * @Description:
 */
public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
