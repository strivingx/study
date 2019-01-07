package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 *  -Xms1024m -Xmx1024m -Xmn512m -XX:+PrintGCDetails
 */
public class TestGCRoots01 {
	private int _10MB = 10 * 1024 * 1024;
	private byte[] memory = new byte[8 * _10MB];

	public static void main(String[] args) {
		Math.max(1,2);
		List<String> list = new ArrayList<>();
		method01();
		System.gc();
		System.out.println("返回main方法");
		System.gc();
		System.out.println("第二次GC完成");
	}

	volatile int [] arr;
	public static void method01() {
		TestGCRoots01 t = new TestGCRoots01();
		System.gc();
		System.out.println("第一次GC完成");
	}

}