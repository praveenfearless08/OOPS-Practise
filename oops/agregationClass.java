class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }

    // Other methods and attributes of Department class
}

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    // Other methods and attributes of Employee class
}


public class agregationClass {
    public static void main(String[] args) {
        Employee manager = new Employee("John Doe", 123);
        Department department = new Department("IT", manager);

        // Accessing the manager of the department
        Employee deptManager = department.getManager();
        System.out.println("Department Manager: " + deptManager.getName());
    }
}

