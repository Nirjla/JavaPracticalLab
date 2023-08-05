class EmployeeDetails {
    public int empId;
    public String empName;
    public String empGender;
    public String empAddress;
    public String empPosition;

    public EmployeeDetails(int empId, String empName, String empGender, String empAddress, String empPosition) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.empAddress = empAddress;
        this.empPosition = empPosition;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Gender: " + empGender);
        System.out.println("Employee Address: " + empAddress);
        System.out.println("Employee Position: " + empPosition);
    }
}

class SalaryInfo extends EmployeeDetails {
    public double salary;
// if you do not include these instance variables in the constructor of the SalaryInfo class, then you will not be able to initialize them when you create an object of the SalaryInfo class.
    public SalaryInfo(int empId, String empName, String empGender, String empAddress, String empPosition, double salary) {
        super(empId, empName, empGender, empAddress, empPosition);
        this.salary = salary;
    }

    public void calcTax() {
        double tax = 0;
        if (salary <= 400000) {
            tax = salary * 0.01;
        } else if (salary > 400000 && salary <= 800000) {
            tax = salary * 0.1;
        } else {
            tax = salary * 0.2;
        }
        double finalSalary = salary - tax;
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class EmployeeDetailsDemo {
    public static void main(String[] args) {
        SalaryInfo salaryObj = new SalaryInfo(1234, "John Doe", "Male", "123 Main St", "Manager", 1000000);
        salaryObj.displayDetails();
        salaryObj.calcTax();
    }
}