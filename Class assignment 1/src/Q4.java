import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num[]=new int [5];
        Scanner input=new Scanner(System.in);
        System.out.println("Add five elements to the array: ");
        for (int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        System.out.println("the array elements are: ");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }

}
