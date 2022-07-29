package entities.employeeSystem;

public interface Authenticable {

    public abstract void setPassword(int password) ;

    public abstract boolean authentication(int password) ;
}
