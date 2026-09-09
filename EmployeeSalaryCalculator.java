import java.util.Scanner;

public class EmployeeSalaryCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        double grossSalary = hoursWorked * hourlyRate;

        System.out.println("Gross Salary: PHP " + grossSalary);

        sc.close();
    }
}