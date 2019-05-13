package com.io;
import java.io.*;
 
/**
 * 
 * @author Administrator
 * @time 2019年5月7日 上午11:24:52
 * @used 用途：使用 BufferedReader 在控制台读取字符
 */
public class BRRead {
    public static void main(String args[]) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        System.out.println("===============使用read()方法读取===============");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
        System.out.println("方法执行完成啦。。");
    }
}