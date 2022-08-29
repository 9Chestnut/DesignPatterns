package creatorMode.prototypeMode;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:47
 * @Description:
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型赋值成功！");
        return (Realizetype) super.clone();
    }
}
