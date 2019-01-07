public class 统计数字二进制1的个数 {
    public static void main(String[] args) {
        System.out.println(countbit1(112));
        System.out.println(countbit1(-1));
        System.out.println(countbit1(0));
        System.out.println(countbit1(-0));
    }

    /**
     *
     * 统计二进制1的个数，
     * val = val & (val - 1);可以消除最低位的1
     * 数字用补码表示: https://www.cnblogs.com/zhangziqiu/archive/2011/03/30/ComputerCode.html
     *      正数的原码，反码，补码相同
     *      负数的反码除符号位，其余取反，补码为反码加1
     *      用补码表示可以将符号位参与运算，并且0表示唯一，  4位可以表示-8   1000
     *
     */
    public static int countbit1(long val) {
        int count = 0;
        while (val != 0) {
            val = val & (val - 1); // 消除最低位的1
            count++;
        }
        return count;
    }

}
