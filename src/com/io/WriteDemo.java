package com.io;

//演示 System.out.write().
public class WriteDemo {
	public static void main(String args[]) {
		int b;
		b = 'A';
		System.out.write(b);//该方法将 b 的低八位字节写到流中。
		System.out.write('\n');
	}
}