package org.xueyao.template.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流
 * @author Yao Xue
 * @date Aug 15, 2017 11:06:02 AM
 */
public class ExchageStream {
    /**
     * 字节转成字符的输入转换流
     * @param path
     * @throws Exception
     */
    public static void inputStreamReader(String path) throws Exception {
        //创建字节数据转成字符数据的输入转换流，指定编码表
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "utf-8");
        //创建数组
        char[] ch =  new char[1024];
        int len = -1;
        while ((len = isr.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }
        //释放资源
        isr.close();
    }
    
    /**
     * 字符转字节输出转换流
     * @param path
     * @throws Exception
     */
    public static void outputStreamWriter(String path) throws Exception {
        //创建字符数据转字节数据输出转换对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), "utf-8");
        //写入数据
        osw.write("你好");
        //刷新
        osw.flush();
        //释放资源
        osw.close();
    }
}
