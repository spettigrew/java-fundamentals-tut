package employeeApp;

public class Employee {
    // fields (know)
    private static int maxId = 0; //max ID same for all employees
    private int id;
    private String fname; //String is a class that have been added on to Java. It's an array of char. It's a class, hence the capitaliztion
    private String lname;
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlanId;
    
    //constructor
    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId) {

        maxId++;
        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;           
    }
    // methods (behaviors)
    
     //getter
    public int getId() {
     return id;   
    }

    public String fnmae() {
        return fname;
    }
    
    public String lname() {
        return lname;
    }

    public double salary() {
        return salary;
    }

    public boolean has401k() {
        return has401k;
    }

    public int companyId() {
        return companyId;
    }

    public int healthPlanId() {
        return healthPlanId;
    }

    //setters
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHas401k(boolean has401k) {
        this.has401k = has401k;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId) {
        this.healthPlanId = healthPlanId;
    }

    //method similar to a getter

    public String getName() {
        return fname + " " + lname;
    }
}