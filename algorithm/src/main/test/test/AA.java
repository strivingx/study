package test;

// 旋转数组  345123  求最小值
public class AA {
    public static void main(String[] args) {
        System.out.println(find("3333343333333"));
        System.out.println(find("123456"));
        System.out.println(find("34512"));
        System.out.println(find("34512"));
        System.out.println(find("345123"));
    }

    public static char find(String str) {
        //if(str.charAt(0) < str.charAt(str.length()-1)) return str.charAt(0);
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            char c = str.charAt(mid);
            if (c > str.charAt(0)) {
                left = mid + 1;
            } else if (c < str.charAt(str.length() - 1)) {
                right = mid - 1;
            } else {
                return c;
            }
        }
        return str.charAt(left % str.length());
    }
}
