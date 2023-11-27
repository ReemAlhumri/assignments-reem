public class Q4 {
    public static void main(String[] args) {
        System.out.println(isEven(8));
        System.out.println(isEven(3));
    }
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
}
