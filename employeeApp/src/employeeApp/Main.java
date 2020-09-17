package employeeApp;

/*
Employees
    Companies
    Health Plan 
*/

public class Main {
    // work with class directly or with a method directly within that class, we use static. Method can be called without instantiating an object of the class. Call it directly.
    private static void workWithData() {
        System.out.println("Welcome to Lambda School's Java!!");

        // Healthplan h1;
        // h1 = new Healthplan("My Healthplan 1")
    Healthplan h1 = new Healthplan("My Healthplan 1");
    Healthplan h2 = new Healthplan("My Heathplan 2");

    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 100);
        // String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId
    Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
    Employee emp2 = new Employee("Mary", "Ford", 80000, true, c1.id, h2.getId());
    Employee emp3 = new Employee("John", "Jones", 80000, false, c2.id, h2.getId());

    System.out.println(c1);

    emp1.setSalary(emp1.getSalary() + 5000);
    System.out.println(emp1.getFname() + " " + emp1.getSalary());

    System.out.println();
    System.out.println(c1.debt / 7); // int - whole part
    System.out.println(c1.debt % 7); // int - reminder
    System.out.println(c1.debt / 7.0); // decimal

    int result = 100 / (int) 3.14;
    System.out.println(result);
    }

    public static void main(String[] args) {
        workWithData();
    }
}