public class 跳楼梯 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":  jimp1or2: "+ jimp1or2(i) + "  jimp1ton: " + jimp1ton(i));
        }
    }

    /**
     * 一次可以跳1或2层，斐波那契数列
     * @param n
     * @return
     */
    public static int jimp1or2 (int n) {
        if (n == 0 || n == 1) return 1;
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * 一次可以跳1到n层
     *
     * n = 0, 1： 	f(0) = 1 or  f(1) = 1
     * n > 1：
     *      f(n)   = f(n-1) + f(n-2)    + ...           + f(n-n)
     *      f(n-1) =          f(n-1 -1) + f(n-1 -2) +...+ f(n-1 -(n-1))
     *      两式相减： f(n)-f(n-1) = f(n-1)
     *      f(n) = 2 * f(n-1) = 2 ^ (n-1)
     */
    public static int jimp1ton (int n){
        if(n == 0) return 1;
        return 1 << (n-1);
    }

}
