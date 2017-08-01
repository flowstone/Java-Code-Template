package org.xueyao.template.io;

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
        int len = 0;
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
    
    
}
