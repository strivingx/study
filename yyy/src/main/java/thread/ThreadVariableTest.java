package thread;

import java.util.concurrent.TimeUnit;

/**
 * 线程共享变量（基础类型）可见性测试，
 * 线程会将基础类型共享变量值拷贝至线程栈帧中的局部变量表
 * 在遇到synchronized时，会导致线程重新读主存数据
 */
public class ThreadVariableTest implements Runnable {

    public static boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            /**
             *
             * 一个线程执行临界区代码过程如下：
             * 1 获得同步锁
             * 2 清空工作内存
             * 3 从主存拷贝变量副本到工作内存
             * 4 对这些变量计算
             * 5 将变量从工作内存写回到主存
             * 6 释放锁
             *
             */
            System.out.println(flag); // println 使用了synchronized，会导致线程重新读主存数据
        }
        System.out.println(Thread.currentThread().getName() + "exit.");
    }

    /**
     * 主线程结束时将变量内容写入主存
     */
    public static void main(String[] args) throws InterruptedException {
        ThreadVariableTest runnable = new ThreadVariableTest();
        Thread t = new Thread(runnable, "task");
        t.start();
        TimeUnit.MILLISECONDS.sleep(10);
        runnable.flag = false;
    }

}