public class Q7 {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(9));
    }
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
