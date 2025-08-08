package employee;

public class Asscprof extends Employee {
    public double bpay;
    public String des;

    public Asscprof(String empname, String empid, String address, String mail, String mobno, double bpay) {
        super(empname, empid, address, mail, mobno);
        this.bpay=bpay;
        this.des="Associate Professor";
    }

    @Override
    public void payslip() {
        double da=0.6*bpay;
        double hra=0.3*bpay;
        double totsal=da+hra;

        display();
        System.out.println("Designation: " + des);
        System.out.println("Total salary: " + totsal);
    }
} 