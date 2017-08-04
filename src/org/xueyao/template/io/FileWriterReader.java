package org.xueyao.template.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流的模板
 * @author Yao Xue
 * @date Aug 2, 2017 2:15:37 AM
 */
public class FileWriterReader {
    /**
     * 字符输出流
     * @param path
     * @throws IOException
     */
    public static void fileWriter(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        char[] chs = {'a','b','c'};
        fw.write(chs);
        fw.flush();
        fw.close();
    }
    
    /**
     * 字符输入流
     * @param path
     * @throws IOException
     */
    public static void fileReader(String path) throws IOException {
        FileReader fr = new FileReader(path);
        char[] chs = new char[1024];
        int len = -1;
        while ((len = fr.read(chs))!= -1) {
            System.out.println(new String(chs, 0, len));
        }
        
        fr.close();
    }
    
    /**
     * 缓冲字符输出流
     * @param path
     * @throws IOException
     */
    public static void bufferedWriter(String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        
        bw.write("字符串");
        bw.newLine();
        bw.flush();
        bw.close();
    }
    
    /**
     * 缓冲字符输入流
     * @param path
     * @throws IOException
     */
    public static void bufferedReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = null;
        while ((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();
    }
}
