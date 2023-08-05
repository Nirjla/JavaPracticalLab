class BankAccount {
    public int accNo;
    public String name;
    public String address;
    public String phone;
    public String gender;

    public BankAccount(int accNo, String name, String address, String phone, String gender) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public void showDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
    }
}

class SavingAccount extends BankAccount {
    public double currentAmount;
    public int month;

    public SavingAccount(int accNo, String name, String address, String phone, String gender, double currentAmount, int month) {
        super(accNo, name, address, phone, gender);
        this.currentAmount = currentAmount;
        this.month = month;
    }

    public double calcTotal() {
        double bonus = 0;
        if (month < 3) {
            bonus = currentAmount * 0.02;
        } else if (month >= 3 && month < 6) {
            bonus = currentAmount * 0.05;
        } else if (month >= 6 && month < 12) {
            bonus = currentAmount * 0.08;
        } else {
            bonus = currentAmount * 0.1103;
        }
        double totalAmount = currentAmount + bonus;
        return totalAmount;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingAccount savingObj = new SavingAccount(1234, "John Doe", "123 Main St", "123-456-7890", "Male", 10000, 9);
        savingObj.showDetails();
        double totalAmount = savingObj.calcTotal();
        System.out.println("Current Amount: " + savingObj.currentAmount);
        System.out.println("Bonus: " + (totalAmount - savingObj.currentAmount));
        System.out.println("Total Amount: " + totalAmount);
    }
}