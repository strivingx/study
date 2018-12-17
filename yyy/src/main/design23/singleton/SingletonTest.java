package singleton;

// 定义单例模式中需要完成的代码逻辑
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("start to test");
        System.out.println(SingletonStatic.getInstance() == SingletonStatic.getInstance());
        System.out.println(SingletonEnumImpl.getInstance() == SingletonEnumImpl.getInstance());
        System.out.println(SingletonEnumDefault.INSTANCE == SingletonEnumDefault.INSTANCE);

        System.out.println(SingletonStatic.getInstance() == SingletonStatic.getInstance());
        System.out.println(SingletonEnumImpl.getInstance() == SingletonEnumImpl.getInstance());
        System.out.println(SingletonEnumDefault.INSTANCE == SingletonEnumDefault.INSTANCE);
    }
}

