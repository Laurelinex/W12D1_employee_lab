package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String noWhiteSpaceInput = name.trim();
        if(noWhiteSpaceInput != "" && noWhiteSpaceInput != null) {
            this.name = noWhiteSpaceInput;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
//        BELOW WORKS, MSG IN TERMINAL BUT CAN'T TEST?
//        if (amount < 0)
//            throw new IllegalArgumentException("Amount needs to be a positive value.");
//        this.salary += amount;

        if(amount < 0) {
            this.salary += 0;
        } else {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }

}
