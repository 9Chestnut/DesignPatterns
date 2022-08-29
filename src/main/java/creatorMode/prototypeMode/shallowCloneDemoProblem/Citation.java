package creatorMode.prototypeMode.shallowCloneDemoProblem;

import lombok.Data;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:52
 * @Description: 具体的原型类
 */
@Data
public class Citation implements Cloneable{

    /**
     * 三好学生奖状上的姓名
     */
    private Student stu;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(stu.getName() + "同学：在2022年第一学期中表现优秀，被评为三好学生");
    }
}
