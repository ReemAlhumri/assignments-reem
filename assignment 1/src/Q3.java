public class Q3 {
    public static void main(String[] args) {
        System.out.println(isMultiple(10L, 2L));
        System.out.println(isMultiple(10L, 4L));
    }
    public static boolean isMultiple(long n, long m) {
        return n % m == 0;}
}