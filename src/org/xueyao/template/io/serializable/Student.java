package org.xueyao.template.io.serializable;

import java.io.Serializable;

/**
 * 学生实现Serializable接口，才可以被序列化
 * @author Yao Xue
 * @date Aug 15, 2017 11:37:47 AM
 */
public class Student implements Serializable{
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 996050521364185345L;
    
    private String name;
    private int age;
    //transient羝字表示瞬态,瞬时的,它修改的成员不能被序列化
    //private transient int gender;
    
    public Student() {}
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
