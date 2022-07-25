package controllers;

import entities.employeeSystem.Employee;

public class BonusControl {
    private Double sum;

    public void register(Employee employee){
        Double bonus = employee.getBonus();
        this.sum = this.sum + bonus;
    }

    public double getSum(){
        return sum;
    }
}
