package org.xueyao.template.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 11:49:49 AM
 */
public class SerializableDemo {
    /**
     * 序列化
     * @param path 文件路径
     * @throws Exception
     */
    public static void objectOutputStream(String path) throws Exception {
        //创建学生对象 
        Student s = new Student("小明", 19);
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        //使用序列化对象中的方法持久化学生对象
        oos.writeObject(s);
        //释放资源
        oos.close();
    }
    
    /**
     * 反序列化
     * @param path
     * @throws Exception
     */
    public static void objectInputStream(String path) throws Exception {
        //创建反序列化对象,指定一个字节输入流用来读取持久文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        //使用反序列化对象调用函数进行读取数据
        Student s = (Student) ois.readObject();
        System.out.println(s.getName()+"==="+s.getAge());
        //关闭资源
        ois.close();
    }
    
}
