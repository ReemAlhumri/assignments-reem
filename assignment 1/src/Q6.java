public class Q6 {
    public static void main(String[] args) {
        System.out.println(sumOfOdd(9));
    }

    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;}
}
