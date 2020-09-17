package employeeApp;

public class Company {
    public static int maxId = 0;
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }
    @Override 
    public String toString() {
        String rtnStr ="Commpany name: " + name + " debt: " + debt;

        return rtnStr;
    }

}
