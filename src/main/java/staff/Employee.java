package staff;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public abstract class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(nonNull(name)) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        if(raise > 0.0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }


}
