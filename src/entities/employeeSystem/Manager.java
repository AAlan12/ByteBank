package entities.employeeSystem;

public class Manager extends Employee{

    private Integer password;

    public boolean authentication(Integer password){
        if(this.password == password){
            return true;
        }else {
            return false;
        }
    }

    public double getBonus(){
        return salary * 0.1;
    }
}
