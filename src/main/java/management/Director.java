package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINumber, double salary, String deptName) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        return 0.02 * getSalary();
    }

}
