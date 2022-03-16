package staff.management;

public class Director extends Manager {

    private int budget;

    public Director(String name, String NINumber, int salary, String deptName, int budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return (this.getSalary() * 0.02);
    }
}
