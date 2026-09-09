import java.util.Scanner;

public class EmployeePayrollRecord 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        String employeeId = sc.nextLine();

        System.out.print("Enter position: ");
        String position = sc.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.println("Name: " + name + "; ID: " + employeeId + "; Position: " + position + "; Hours Worked: " + hoursWorked + "; Hourly Rate: PHP " + hourlyRate);
    }
}
