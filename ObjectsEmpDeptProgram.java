public class ObjectsEmpDeptProgram {
    public static void main(String[] args) {
        Department firstDepartment = new Department(10, "Sales");
        Department secondDepartment = new Department(20, "Music");

        Employee[] employeeArray = { new Employee("John Doe", "john@abc.com", firstDepartment),
                new Employee("Hank Marvin", "hank@abc.com", secondDepartment),
                new Employee("Joan Baez", "joan@abc.com", secondDepartment) };

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        employeeArray[0].setDepartment(secondDepartment);
        System.out.println();

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }
}

class Department {
    int number;
    String name;

    public Department(int number, String name) {
        this.number = number;
        this.name = name;
    }

    int getNumber() {
        return this.number;
    }

    String getName() {
        return this.name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Employee {
    String name;
    String email;
    Department department;

    public Employee(String name, String email, Department department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    Department getDepartment() {
        return this.department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        return this.name + " (" + this.email + "), " + this.department.getName() + " department";
    }
}