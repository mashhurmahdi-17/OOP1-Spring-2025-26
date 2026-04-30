import java.lang.*;

class Employee {
    private double salary; // Encapsulated
    static { System.out.print("Static_E "); }
    
    Employee() { 
        System.out.print("Emp_Default "); 
    }
    Employee(double s) {
        this.salary = s;
        System.out.print("Emp_Param ");
    }
}

class Manager extends Employee {
    static { System.out.print("Static_M "); }
    
    Manager() {
        super(1); // Explicitly calling parent's param constructor
        System.out.print("Mgr_Default ");
    }
    Manager(int bonus) {
        // Implicitly calls super() [Parent's default constructor]
        System.out.print("Mgr_Param ");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Main_Start ");
        Manager m1 = new Manager();
        System.out.print("| ");
        Manager m2 = new Manager(5000);
    }
}