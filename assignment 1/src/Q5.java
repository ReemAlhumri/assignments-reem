public class Q5 {
    public static void main(String[] args) {
        System.out.println(sumOfIntegers(9));
    }
    public static int sumOfIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
