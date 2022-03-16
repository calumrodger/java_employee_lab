package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager (String name, String NINumber, int salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
