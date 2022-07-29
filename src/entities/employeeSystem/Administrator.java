package entities.employeeSystem;

public class Administrator extends Employee implements  Authenticable{

    private  UsefulAuthentication authenticator;

    public Administrator(){
        this.authenticator = new UsefulAuthentication();
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authentication(int password) {
        return this.authenticator.authentication(password);
    }

    @Override
    public double getBonus() {
        return 50;
    }
}
