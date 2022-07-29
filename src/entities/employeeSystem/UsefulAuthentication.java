package entities.employeeSystem;

public class UsefulAuthentication {
    private int password;

    public void setPassword(int password){
        this.password = password;
    }
    public boolean authentication(int password){
        if(this.password == password){
            return true;
        }else {
            return false;
        }
    }
}
