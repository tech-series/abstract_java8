package com.abs;

public class Salaried extends Employee{

    private static final double DEFAULT_SALARY = 120000;
    private double salary = DEFAULT_SALARY;

    public Salaried(){}
    public Salaried(String name){
       this(name,DEFAULT_SALARY);
    }
    public Salaried(String name, double salary){
        super(name);
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary/12;
    }
}
