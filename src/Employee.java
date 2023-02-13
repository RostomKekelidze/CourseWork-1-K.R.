public class Employee {
    private static int counterID = 1;

    private int id;
    private String fullName;
    private int departmentID;
    private int salary;

    public Employee(String fullName, int departmentID, int salary) {
        this.id = counterID++;
        this.fullName = fullName;
        this.departmentID = departmentID;
        this.salary = salary;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public int getDepartmentID() {
        return departmentID;
    }

    public int getSalary() {
        return salary;
    }


    public String toSring() {
        return String.format("id :%d,ФИО :%s ,ЗП : %d, № Отдела: %d",
                id,
                fullName,
                salary,
                departmentID

        );

    }
}
