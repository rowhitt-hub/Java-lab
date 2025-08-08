import employee.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for one employee:");

        System.out.println("Select employee type:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor (Asstprof)");
        System.out.println("3. Associate Professor (Asscprof)");
        System.out.println("4. Professor");

        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter empname: ");
        String empname = sc.nextLine();

        System.out.print("Enter EmpID: ");
        String empid = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter mail: ");
        String mail = sc.nextLine();

        System.out.print("Enter Employee Number: ");
        String mobno = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Create the employee object based on numeric choice
        switch (choice) {
            case 1:
                emplist.add(new Programmer(empname, empid, address, mail, mobno, salary));
                break;
            case 2:
                emplist.add(new Asstprof(empname, empid, address, mail, mobno, salary));
                break;
            case 3:
                emplist.add(new Asscprof(empname, empid, address, mail, mobno, salary));
                break;
            case 4:
                emplist.add(new Prof(empname, empid, address, mail, mobno, salary));
                break;
            default:
                System.out.println("Invalid choice. No employee added.");
                break;
        }

        System.out.println("\n--- Payslip ---");
        for (Employee emp : emplist) {
            emp.payslip();
        }

        sc.close();
    }
}
