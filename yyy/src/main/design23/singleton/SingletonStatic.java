package singleton;

public class SingletonStatic implements Singleton{
    /**
     * 由于静态内部类SingletonHolder只有在getInstance()方法第一次被调用时，才会被加载，而且构造函数为private，因此该种方式实现了懒汉式的单例模式。
     * 不仅如此，根据JVM本身机制，静态内部类的加载已经实现了线程安全。
     */
    private static class SingletonHolder {
        static {
            System.out.println("SingletonHolder");
        }

        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    @Override
    public void doSomething() {
        System.out.println("implement by static");
    }

    private SingletonStatic() {
    }

    public static final SingletonStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
