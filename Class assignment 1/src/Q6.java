import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int num[] = new int[5];
        input(num);
        print(num);
    }
    public static void input(int num[]) {
        Scanner input=new Scanner(System.in);
        for (int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
    }
    public static void print(int num[]) {
        System.out.println("the array elements are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
