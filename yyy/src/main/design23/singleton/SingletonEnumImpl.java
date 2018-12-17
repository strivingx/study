package singleton;

// 定义单例模式中需要完成的代码逻辑
public enum SingletonEnumImpl implements Singleton {
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("implement by enum");
        }
    };

    SingletonEnumImpl(){
        System.out.println("SingletonEnumImpl");
    }
    public static Singleton getInstance() {
        return SingletonEnumImpl.INSTANCE;
    }
}


