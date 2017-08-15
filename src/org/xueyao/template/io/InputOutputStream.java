package org.xueyao.template.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流模板
 * @author Yao Xue
 * @date Aug 2, 2017 2:01:33 AM
 */
public class InputOutputStream {
    /**
     * 字节输入流操作模板
     * @param path  文件路径
     * @throws IOException
     */
    public static void fileInputStream(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        byte[] buf = new byte[1024];
        //保存读取字节的个数
        int len = -1;
        while ((len = fis.read(buf))!= -1) {
            System.out.println(new String(buf, 0, len));
        }
        fis.close();
    }
    
    /**
     * 字节输出流操作模板
     * @param path 文件路径 
     * @throws IOException
     */
    public static void fileOutputStream(String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        //获得当前系统的换行符
        String lineSeparator = System.lineSeparator();
        fos.write((lineSeparator+"测试代码").getBytes());
        fos.close();
    }
    
    /**
     * 字节输入流缓冲区操作模板
     * @param path 文件路径 
     * @throws IOException
     */
    public static void bufferedInputStream(String path) throws IOException {
        //创建输入流缓冲区对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //创建数组
        byte[] b = new byte[1024];
        //定义一个变量
        int len = -1;
        while ((len = bis.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        //释放资源
        bis.close();
    }
    
    /**
     * 字节输出流缓冲区操作
     * @param path
     * @throws IOException
     */
    public static void bufferedOutputStream(String path) throws IOException {
        //创建输入流缓冲区对象 
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        //获得当前系统的换行符
        String lineSeparator = System.lineSeparator();
        bos.write((lineSeparator+"测试代码").getBytes());
        //将缓冲区中的数据刷新到输出流中
        bos.flush();
        //释放资源
        bos.close();
    }
}
