package creatorMode.prototypeMode.shallowCloneDemoProblem;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:55
 * @Description: 使用浅克隆导致最后输出的都是李四的名字
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建具体的原型对象
        Citation citation = new Citation();

        Student stu = new Student();

        stu.setName("张三");

        citation.setStu(stu);

        // 克隆奖状对象
        Citation clone = citation.clone();

        clone.getStu().setName("李四");

        citation.show(); // 李四同学：在2022年第一学期中表现优秀，被评为三好学生

        clone.show(); // 李四同学：在2022年第一学期中表现优秀，被评为三好学生
    }
}
