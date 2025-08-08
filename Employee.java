package employee;

public class Employee {
    public String empname;
    public String empid;
    public String address;
    public String mail;
    public String mobno;

    public Employee(String empname, String empid, String address, String mail, String mobno) {
        this.empname=empname;
        this.empid=empid;
        this.address=address;
        this.mail=mail;
        this.mobno=mobno;
    }

    public void display() {
        System.out.println("Employee name: " + empname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee address: " + address);
        System.out.println("Employee mail ID: " + mail);
        System.out.println("Employee mobile number: " + mobno);
    }
    public void payslip() {
        //hi
    }
}
