package singleton;

/**
 *
 * https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java
 * https://dzone.com/articles/java-singletons-using-enum    nice blog
 *
 * 枚举类实现其实省略了private类型的构造函数
 * 枚举类的域(field)其实是相应的enum类型的一个实例对象
 *
 * public final class Singleton {
 *     public final static Singleton INSTANCE = new Singleton();
 *     private Singleton(){}
 * }
 *
 * An enum type has no instances other than those defined by its enum constants.
 * It is a compile-time error to attempt to explicitly instantiate an enum type.
 * The final clone method in Enum ensures that enum constants can never be cloned,
 * and the special treatment by the serialization mechanism ensures that duplicate instances are never created as a result of deserialization.
 * Reflective instantiation of enum types is prohibited.
 * Together, these four things ensure that no instances of an enum type exist beyond those defined by the enum constants.
 */
public enum SingletonEnumDefault {
    INSTANCE; // INSTANCE is same as public static final SingletonEnumDefault INSTANCE = new Singleton();

    // SingletonEnum默认实现了一个空的私有构造方法
    private SingletonEnumDefault() {
        System.out.println("SingletonEnumDefault");
    }
}


