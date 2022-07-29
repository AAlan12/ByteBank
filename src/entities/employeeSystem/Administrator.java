package entities.employeeSystem;

public class Administrator extends Employee implements  Authenticable{

    private  Integer password;

    @Override
    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public boolean authentication(Integer password) {
        if(this.password == password){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonus() {
        return 50;
    }
}
