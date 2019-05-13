package com.io;
import java.util.Scanner; 
 
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
 
        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        Scanner scan2 = new Scanner(System.in);
        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan2.hasNextLine()) {
            String str2 = scan2.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
        scan2.close();
    }
}