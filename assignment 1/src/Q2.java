public class Q2 {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[6];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry();
        }
        GameEntry[] B = A.clone();
        A[4].score = 550;
        System.out.println("the score in A="+A[4].score);
        System.out.println("the score in B="+B[4].score);
    }
}
class GameEntry{
    int score;
}

