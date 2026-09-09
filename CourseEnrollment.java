import java.util.Scanner;

public class CourseEnrollment 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter subject code: ");
        String subjectCode = sc.nextLine();

        System.out.print("Enter subject title: ");
        String subjectTitle = sc.nextLine();

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        System.out.print("Enter section letter: ");
        char section = sc.next().charAt(0);

        System.out.println("Student: " + studentName + "; Subject: " + subjectCode + " - " + subjectTitle + "; Units: " + units + "; Section: " + section);
    }
}