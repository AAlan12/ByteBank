package entities.employeeSystem;

public class InternalSystem {

    private  Integer password = 7777;

    public void authentication(Authenticable employee){
        boolean authenticated = employee.authentication(this.password);

        if(authenticated){
            System.out.println("Can enter the system");
        }else {
            System.out.println("Can't enter the system");
        }
    }
}
