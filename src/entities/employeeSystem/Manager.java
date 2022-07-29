package entities.employeeSystem;

public class Manager extends Employee implements Authenticable{

    private UsefulAuthentication authenticator;

    public Manager(){
        this.authenticator = new UsefulAuthentication();
    }


    @Override
    public void setPassword(int password){
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authentication(int password){
        return this.authenticator.authentication(password);
    }

    public double getBonus(){
        return super.getSalary();
    }
}
