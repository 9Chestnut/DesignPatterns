package creatorMode.prototypeMode.deepClone;

import java.io.*;

/**
 * @author: 9Chestnut
 * @Date: 2022年08月29日 22:55
 * @Description: 深克隆
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建具体的原型对象
        Citation citation = new Citation();

        Student stu = new Student();

        stu.setName("张三");

        citation.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Think\\Desktop\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(citation);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Think\\Desktop\\b.txt"));
        //读取对象
        Citation clone = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = clone.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        citation.show();
        clone.show();


    }
}
