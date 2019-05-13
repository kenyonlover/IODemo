package com.io;

import java.io.*;

/**
 * 
 * @author Administrator
 * @time 2019年5月7日 上午11:33:00
 * @used 用途：使用 BufferedReader 在控制台读取字符
 */
public class BRReadLines {
	public static void main(String args[]) throws IOException {
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("===============使用readline()方法读取===============");
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("end"));
		System.out.println("方法执行完成啦。。");
	}
}