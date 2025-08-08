package employee;

public class Prof extends Employee {
    public double bpay;
    public String des;

    public Prof(String empname, String empid, String address, String mail, String mobno, double bpay) {
        super(empname, empid, address, mail, mobno);
        this.bpay=bpay;
        this.des="Professor";
    }

    @Override
    public void payslip() {
        double da=0.8*bpay;
        double hra=0.3*bpay;
        double totsal=da+hra;

        display();
        System.out.println("Designation: " + des);
        System.out.println("Total salary: " + totsal);
    }
} 