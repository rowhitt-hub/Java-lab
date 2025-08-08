import employee.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<>();

        emplist.add(new Programmer("Rohit", "AB302", "Kerela", "rohit@gmail.com", "2025", 30000));
        emplist.add(new Asstprof("Rahul", "D110", "Chennai", "rahul@gmail.com", "2116", 40000));
        emplist.add(new Asscprof("Karthik", "A114", "Bangalore", "karthik@gmail.com", "2209", 50000));
        emplist.add(new Prof("Hari", "C109", "Goa", "hari@gmail.com", "2304", 60000));

        for (Employee emp : emplist) {
            emp.payslip();
        } 
    }
}