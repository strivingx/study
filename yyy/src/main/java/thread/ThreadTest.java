/*
package thread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class ThreadTest implements java.io.Serializable {

    //使用方法
    private static Unsafe getUnsafeInstance() {
        try {
            Field theUnsafeInstance =  Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeInstance.setAccessible(true);
            return (Unsafe) theUnsafeInstance.get(Unsafe.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static final Unsafe unsafe = getUnsafeInstance();
    private static volatile int count = 0;
    static class SynchronizedDemo implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                */
/*synchronized (thread.ThreadTest.class) {
                    count += 1;
                }*//*

                int prev, next;
                do {
                    prev = count;
                    next = count + 1;
                } while (!unsafe.compareAndSwapInt(count,  0, prev, next));
            }
           System.out.println("cost: " + (System.currentTimeMillis() - start));

        }

    }

    static long start = 0;

    public static void main(String[] args) throws Exception {
        start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {

            Thread thread = new Thread(new SynchronizedDemo());
            thread.start();
        }
        Thread.sleep(500);
        System.out.println("result: " + count);
    }

}
*/
