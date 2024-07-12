package com.abs;

public class Hr extends Employee{
    private static final double DEFAULT_SALARY = 1200;
    private double salary = DEFAULT_SALARY;
    public Hr(){}
    public Hr(String name){
        this(name,DEFAULT_SALARY);
    }
    public Hr(String name, double salary){
        super(name);
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary/24;
    }
}
