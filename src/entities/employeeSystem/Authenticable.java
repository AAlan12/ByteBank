package entities.employeeSystem;

public interface Authenticable {

    public abstract void setPassword(Integer password) ;

    public abstract boolean authentication(Integer password) ;
}
