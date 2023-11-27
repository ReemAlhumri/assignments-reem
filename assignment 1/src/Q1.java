import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }
    public static void inputAllBaseTypes() {
        Scanner R = new Scanner(System.in);
        System.out.println("Enter the student's name:");
        String name = R.nextLine();
        System.out.println("Enter the student's age:");
        short age = R.nextShort();
        System.out.println("Enter the student's ID:");
        int ID = R.nextInt();
        System.out.println("Enter the student's phone number :");
        long PhoneNumber = R.nextLong();
        System.out.println("Enter the student's high school avg :");
        float avg = R.nextFloat();
        System.out.println("Enter the student's English course's avg :");
        double EnglishCourseAvg = R.nextDouble();
        System.out.println("Enter true if you're single , Enter false if you're marry : ");
        boolean social_situation = R.nextBoolean();
        System.out.println("Enter the student's gender g for girls b for boys :");
        char gender = R.next().charAt(0);
    }
}
